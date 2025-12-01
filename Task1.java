public class Task1 {
    public static void main(String[] args) {
        int sum = 0 ;
        for(int j =0; j<=100; j++){
            System.out.println(j);
        }
        System.out.println();
        for( int i=1; i<=100 ; i++){
            if ( i%2 ==0 ) {
                sum= sum +i; 
            }
        }
        System.out.println("Sum of even from 1 to 100 is: "+ sum);

    }
}
