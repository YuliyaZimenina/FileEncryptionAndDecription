import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File inFile = new File("src\\inText.txt");
        File outFile = new File("src\\outFile");

        byte[] sourceText = new byte[(int) inFile.length()];

        // Convert file to bytes
        FileInputStream fileInputStream = new FileInputStream(inFile);
        fileInputStream.read(sourceText);
        for (int i = 0; i < sourceText.length; i++) {
            System.out.print((char) sourceText[i]);
        }
        System.out.println("\n");
        //File encryption and decryption
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");
        SecretKey myDesKey = keyGenerator.generateKey();

        Cipher desCipher = Cipher.getInstance("DESede");

        desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
        byte[] textEncrypted = desCipher.doFinal(sourceText);

        String convertString = new String(textEncrypted);
        System.out.print(convertString + "\n");


        desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
        byte[] textDecrypted = desCipher.doFinal(textEncrypted);

        convertString = new String(textDecrypted);
        System.out.print(convertString + "\n");


        // Write to file
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);
        fileOutputStream.write(sourceText);
        fileOutputStream.close();


    }
}
