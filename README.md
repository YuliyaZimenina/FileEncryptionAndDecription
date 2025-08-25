# File Encryption & Decryption 
## (DESede Algorithm)

This project demonstrates working with cryptography (the `DES` encryption algorithm) in a Java program.

## Table of contents

1. [Description](#description)
2. [Technologies](#technologies)
3. [Installation & Running](#installation-&-running)
4. [Author](#author)
5. [Usage Example](#usage-example)
6. [Screenshots](#screenshots)

## Description
The **Java** program demonstrates the process of **encrypting and decrypting text** in files using the 
**Triple DES (DESede)** algorithm.

### Features
- Reads text from `inText.txt`
- Encrypts content with `DESede` algorithm
- Decrypts the encrypted text
- Prints the original, encrypted, and decrypted text to the console
- Writes the result to the `outFile`

### ***Note***

- The `DESede` (Triple DES) algorithm is considered outdated for real-world applications, but it work well for demonstrating encryption principles.
- For production use more modern algorithms such as **AES** or **RSA** are recommended.

## Technologies
- **Java SE** (version 17)
- **javax.crypto** (`Cipher`, `KeyGeneration`, `SecretKey`)

## Installation & Running
1. Clone the repository:
```bash
git clone https://github.com/YuliyaZimenina/FileEncryptionAndDecription.git
cd FileEncryptionAndDecription

```

2. Open the project in your favorite IDE (IntelliJ IDEA, Eclipse, etc.).
3. Make sure **Java 17** is set as the project SDK.
4. Create an input file:
```bash

src/inText.txt

```

Put any text inside to be encrypted

5. Run the `Main.java` file

## Author
[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## Usage Example

```java

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

...

```

## Screenshots

1. The result of the program:

<img src="images/1.%20Output.png" alt="The result of the program." width="450"/>

2. Source text for encryption:

<img src="images/2.%20Original%20text.png" alt="Source text." width="450"/>







 
