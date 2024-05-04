// WAP to print all the prime numbers within a range (e.g. 1 to 100).
public class Q3{
    public static void main(String []args){
        System.out.println("Prime number between 1 to 100:");
        int flag = 0;
        for(int i =  2 ;i<=100;i++){
            for(int j = 2;j<=i/2;j++){
                if(i%j==0) { 
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                flag = 0;
            }
            else{
                System.out.println(i);
            }
        }
    }
}