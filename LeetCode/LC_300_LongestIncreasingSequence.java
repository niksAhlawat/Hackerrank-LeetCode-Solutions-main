import java.util.Arrays;

public class LC_300_LongestIncreasingSequence {
    public static void main(String[] args) {
        int[]  nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    private static int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1);
        int result = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    lis[i]= Math.max(lis[i], lis[j]+1);
                }
            }
            result = Math.max(lis[i], result);
        }
     
       return result;
    }
}
