class Solution {

    private int minSubarraySum(int[] nums){
        int currSum = nums[0];
        int minSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(currSum > 0){
                currSum = 0;
            }

            currSum += nums[i];
            minSum = Math.min(currSum, minSum);
        }

        return minSum;
    }

    private int maxSubarraySum(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }

            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public int maxSubarraySumCircular(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        boolean x = true;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                x = false;
                break;
            }

            ans = Math.max(ans, nums[i]);
        }

        if(x){
            return ans;
        }

        int ans1 = maxSubarraySum(nums);

        int arraySum = 0;

        for(int i = 0; i < nums.length; i++){
            arraySum += nums[i];
        }

        int ans2 = arraySum - minSubarraySum(nums);

        return Math.max(ans1, ans2);
    }
}
