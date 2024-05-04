public class Q5{
    public static void main(String []args){
        int array[] = { 1, 2 , 2 , 3 , 4 , 5 ,5 , 5};
        int arrays[] = new int[array.length];
        int j =  0;
        for(int i = 0 ; i < array.length - 1 ;i++){
            if(array[i] != array[i+1]){
                  arrays[j++] = array[i];
           }
        }
        arrays[j++] = array[array.length-1];
         for(int i = 0 ; i < j ;i++){
       array[i] = arrays[i];
       System.out.println(array[i]);
    }

}
}
