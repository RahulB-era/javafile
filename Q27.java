import java.io.*;

public class Q27 {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream to read from a file named "input.txt"
            FileInputStream fileInputStream = new FileInputStream("input.txt");

            // Create a BufferedInputStream for efficient reading of bytes
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            // Read bytes from the file and convert them to characters
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                // Convert the byte to a character and print it to the console
                System.out.print((char) data);
            }

            // Close the BufferedInputStream and FileInputStream
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
