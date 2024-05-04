// WAP that makes use of String class methods.
public class Q8{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello World";

        System.out.println(s1.concat(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.charAt(1));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.equals(s2));
        System.out.println(s3.contains(s1));
        System.out.println(s3.hashCode());
        System.out.println(s1.codePointAt(0)); 	
        System.out.println(String.join("-","H","E","L","L","O"));

    }
}
