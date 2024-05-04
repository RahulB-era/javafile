
//java FileCopy input.txt output.txt

import java.io.*;

public class Q25 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter valid string argument like java Q25 input.txt output.txt");
            System.exit(1);
        }

        String inputFile = args[0];
        String outputFile = args[1];
        int wordCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Computers")) {
                    writer.write(line);
                    writer.newLine();
                }

                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Number of words in the first file: " + wordCount);

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

