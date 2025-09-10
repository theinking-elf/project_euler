public class LargestPalindromeProduct {


    public static void main (String[] args){
        /*
         * a palindromic number reads the same both ways.
         * The largest palindrom madefrom the palindrom of two 2 digit numbers is 9009 = 91 * 99
         * find the largest palindrome of two 3 digit numbers
         */

         int i = 999;
         int j = 999;
         int forwardProduct = 0;
         int maxPalindrome = 0;
         boolean ispalindrome = false;
         int digit = 0;

            for ( i = 999; i >= 100; i--){
                for ( j = 999; j >= 100; j--){
                    forwardProduct = i * j;

                    String forwardProductString = String.valueOf(forwardProduct);
                    String reverseProductString = "";


                    for (int n = forwardProductString.length() - 1; n >= 0; n--){
                        reverseProductString = reverseProductString + forwardProductString.charAt(n);
                    }

                    if ( reverseProductString.equals(forwardProductString) && forwardProduct > maxPalindrome){
                        maxPalindrome = forwardProduct;
                        ispalindrome = true;
                    }

                }

            
            }
            
         System.out.println(maxPalindrome);
        }
}
