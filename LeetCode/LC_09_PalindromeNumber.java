public class LC_09_PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;  //0, -121
        System.out.println(isPalindrome(x));
    }
    private static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        /**
        String s = Integer.toString(x);
        int n = s.length()-1;
        if(s.charAt(0) != s.charAt(n)){
            return false; 
           }
        return true; 
        */

        // More Optimized Approach
        int half = 0;
        while(x > half) {
            half = half * 10 + x % 10;
            x /= 10;
        }
        return x == half || x == half/10;
    }
}
