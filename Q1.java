public class Q1{
    public static void main(String args[]){ 
        System.out.println( 
            "S.No.\t  Data Type\t  Size\t  Min. Value\t\t  Max. Value\t"); 
// The SIZE constant gives the size of a data type in bits, while MIN_VALUE and MAX_VALUE provide its minimum and maximum representable values
        System.out.println("1\t  Byte\t\t" + Byte.SIZE 
                           + "\t" + Byte.MIN_VALUE 
                           + "\t\t\t" + Byte.MAX_VALUE); 
        System.out.println("2\t  Short\t\t" + Short.SIZE 
                           + "\t" + Short.MIN_VALUE 
                           + "\t\t\t" + Short.MAX_VALUE); 
        System.out.println("3\t  Integer\t" + Integer.SIZE 
                           + "\t" + Integer.MIN_VALUE 
                           + "\t\t" + Integer.MAX_VALUE); 
        System.out.println("4\t  Float\t\t" + Float.SIZE 
                           + "\t" + Float.MIN_VALUE 
                           + "\t\t\t" + Float.MAX_VALUE); 
        System.out.println("5\t  Long\t\t" + Long.SIZE 
                           + "\t" + Long.MIN_VALUE + "\t"
                           + Long.MAX_VALUE); 
        System.out.println("6\t  Double\t" + Double.SIZE 
                           + "\t" + Double.MIN_VALUE 
                           + "\t\t" + Short.MAX_VALUE); 
        System.out.println("7\t  Character\t"
                           + Character.SIZE); 
    } 
}