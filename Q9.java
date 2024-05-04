// WAP that makes use of StringBuffer class methods.
// String is immutable, while StringBuffer is mutable and thread-safe, making it more efficient for string manipulations in multi-threaded environments.

public class Q9{
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("hello");
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(11," By java");
        System.out.println(sb);

        sb.replace(15,19,"India"); 
        System.out.println(sb);

        sb.delete(11,20);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());
    }
}
