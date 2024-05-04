//WAP to demonstrate checked exception during file handling.
//Checked exceptions are the subclass of the Exception class. These types of exceptions need to be handled during the compile time of the program. These exceptions can be handled by the try-catch block or by using throws keyword otherwise the program will give a compilation error.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q17 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");    //file may exist
            FileReader fr = new FileReader(file);         // Read the file
        } catch (FileNotFoundException e) { //throws FileNotFoundException if file do not exist
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
