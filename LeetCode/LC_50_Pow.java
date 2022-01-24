public class LC_50_Pow {
    // Input: x = 2.00000, n = 10
    // Output: 1024.00000
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(Math.pow(2.00, 10));
    }

    static double myPow(double x, int n) {
        if (n == Integer.MAX_VALUE) return x;
        else if (n == Integer.MIN_VALUE) return (x == 1 || x == -1) ? 1 : 0;
        if(n<0) {
            x = 1/x;
            n *= -1;
        }
        double ans = 1;
        while (n > 0){
            if(n%2 == 1) ans = ans*x;
            x = x*x;
            n = n>>1;
        }
        return ans;
    }
}
    