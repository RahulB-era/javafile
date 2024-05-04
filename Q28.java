import java.io.*;
public class Q28{

    public static void main(String []args){
        if(args.length < 2){
            System.out.println("java Q28 input.txt output.txt");
        }
        try{
            FileInputStream input =new FileInputStream(args[0]);
            FileOutputStream output =new FileOutputStream(args[1]);
            int data;
            while((data = input.read()) != -1){
                output.write(data);
                // output.newLine();
            }
            input.close();
            output.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}