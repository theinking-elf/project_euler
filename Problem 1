public class MultiplesOfThreeOrFive {
    /*
     * If we list all the natural numbers below 10 that are multiples of 3 or 5 
     * we get 3,5,6,and 9. The sum of these multiples is 23.
     * 
     * Find the sum of all the multiples of 3 or 5 below 1000
     *
     */

     public static void main (String[] args){
        int CurrentT = 0;
        // current multiple of three that will be added to the sum
        
        int CurrentF = 0;
        // current multiple of five that will be added to the sum

        int SumofT = 0;
        int SumofF = 0;

        for( int t = 333; t > 0; t--){
            CurrentT = 3 * t;
            if ( CurrentT % 5 != 0 ){
                SumofT = SumofT + CurrentT;
            }
        }

        for (int f = 199; f > 0; f--){
            CurrentF = 5 * f;
            SumofF = SumofF + CurrentF;
        }
        
        System.out.println(SumofT + SumofF);
     }
    
}
