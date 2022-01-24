import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
       // System.out.println(Arrays.toString(twoSum(nums, target)));
        //System.out.println(Arrays.deepToString(optimised_Twosum(nums, target)));
        System.out.println(Arrays.toString(optimised_Twosum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1, -1};

        for (int i= 0; i< nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                if(target == nums[i]+nums[j]){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    
    static int[]  optimised_Twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = {-1, -1};
        for( int i =0; i<nums.length; i++){
            if (map.containsKey(target - nums[i]))
            {
                ans[0] = map.get(target-nums[i]);
                ans[1] = i;    
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
