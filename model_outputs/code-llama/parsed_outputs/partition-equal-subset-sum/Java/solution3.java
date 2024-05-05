class Solution {
    public boolean canPartition(int[] nums) {
       int sum = 0;
       for (int num : nums) {
           sum += num;
       }
       if (sum % 2 == 1) {
           return false;
       }
       int target = sum / 2;
       Arrays.sort(nums);
       int i = nums.length - 1;
       while (i >= 0 && nums[i] > target) {
           i--;
       }
       if (i < 0) {
           return false;
       }
       int j = i - 1;
       while (j >= 0 && nums[j] > target) {
           j--;
       }
       if (j < 0) {
           return false;
       }
       return true;
    }
    
}
