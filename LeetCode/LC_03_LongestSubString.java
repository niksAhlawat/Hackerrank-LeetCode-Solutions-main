import java.util.HashSet;
import java.util.Set;

public class LC_03_LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcdbbyuwjhmnlk";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        
        int start = 0;
        int end = 0;
        int ans = 0;
        Set<Character> set = new HashSet<>();
       
        while (end < s.length()) {
            if (set.add(s.charAt(end))) {
                end++;
                ans = Math.max(ans, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return ans;
    }

}
