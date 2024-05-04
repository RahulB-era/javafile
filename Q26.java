import java.io.*;

public class Q26 {
    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read input from the keyboard
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Create a FileWriter to write to a file named "output.txt"
            FileWriter writer = new FileWriter("output.txt");

            // Create a BufferedWriter to write text to the FileWriter
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            System.out.println("Enter text (type 'exit' to end):");

            String line;
            // Read input from the keyboard until the user types 'exit'
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                // Write the input line to the file
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // Add a new line after each input
            }

            // Close the BufferedReader and BufferedWriter
            reader.close();
            bufferedWriter.close();

            System.out.println("Text written to file successfully.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
