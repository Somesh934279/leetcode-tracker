// Last updated: 7/9/2026, 9:50:41 AM
public class Solution
 {
    public static boolean isPowerOfFour(int n) {
        
        return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;
    }

    public static void main(String[] args) {
      
        int n1 = 16;
        System.out.println("Is " + n1 + " a power of four? " + isPowerOfFour(n1)); 

        
        int n2 = 5;
        System.out.println("Is " + n2 + " a power of four? " + isPowerOfFour(n2)); 

        
        int n3 = 1;
        System.out.println("Is " + n3 + " a power of four? " + isPowerOfFour(n3)); 
    }
}