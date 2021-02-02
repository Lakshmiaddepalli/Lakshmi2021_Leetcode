class Solution {
    public int maxSubArray(int[] nums) {
       int n = nums.length;
       int cur_sum = nums[0];
       int max_sum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            cur_sum = Math.max(nums[i],cur_sum + nums[i]);
            max_sum = Math.max(cur_sum,max_sum);
        }
        
        return max_sum;
    }
}