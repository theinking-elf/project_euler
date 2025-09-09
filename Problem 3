import java.util.Arrays;

public class LargePrimeFactor {
    /* 
     * the prime factors of 13195 are 5, 7, 13, and 29
     * 
     * what is the largest prime factor of the following number:
     * 600851475143
     */

    public static void main (String[] args){
        long remainder = 600851475143L;
        int i = 2;
        
        for ( i = 2; i * i <= remainder; i++){
            if ( remainder % i == 0){
                remainder = remainder / i;


            }
        }

        System.out.println(remainder > 1 ? remainder: i - 1);
    }
}
