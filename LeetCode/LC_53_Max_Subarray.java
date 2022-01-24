public class LC_53_Max_Subarray {

    //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    //Output: 6
    //Explanation: [4,-1,2,1] has the largest sum = 6.
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(naive_maxSubArray(nums));
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArrayDividConquer(nums));
    }

    // Naive Solution using Bruteforce
    static int naive_maxSubArray(int[] nums) {
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
          int sum = 0;
          for (int j = i; j < len; j++) {
            sum += nums[j];
            maxSum = Math.max(maxSum, sum);
          }
        }
        return maxSum;
    }

    // Dynamic Programing Solution
    static  public int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
    }
        return result;
    }


    // Divide and Conquer
    static int maxSubArrayDividConquer(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return helper(nums, 0, nums.length - 1);
      }
      static int helper(int[] nums, int l, int r) {
        if (l > r) return Integer.MIN_VALUE;
        int mid = (l + r) >>> 1;
        int left = helper(nums, l, mid - 1);
        int right = helper(nums, mid + 1, r);
        int leftMaxSum = 0;
        int sum = 0;
        // left surfix maxSum start from index mid - 1 to l
        for (int i = mid - 1; i >= l; i--) {
          sum += nums[i];
          leftMaxSum = Math.max(leftMaxSum, sum);
        }
        int rightMaxSum = 0;
        sum = 0;
        // right prefix maxSum start from index mid + 1 to r
        for (int i = mid + 1; i <= r; i++) {
          sum += nums[i];
          rightMaxSum = Math.max(sum, rightMaxSum);
        }
        // max(left, right, crossSum)
        return Math.max(leftMaxSum + rightMaxSum + nums[mid], Math.max(left, right));
      }
}
