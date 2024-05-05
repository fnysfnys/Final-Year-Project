class Solution {
    public int lengthOfLIS(int[] nums) {
       return lengthOfLIS(nums, 0, nums.length - 1);
    }
    
    private int lengthOfLIS(int[] nums, int start, int end) {
       if (start > end) {
           return 0;
       }
       int mid = (start + end) / 2;
       int left = lengthOfLIS(nums, start, mid - 1);
       int right = lengthOfLIS(nums, mid + 1, end);
       return Math.max(left, right) + 1;
    }
    
}
