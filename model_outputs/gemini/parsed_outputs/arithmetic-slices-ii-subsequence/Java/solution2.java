class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;
        int count = 0, left = 0, right = 2;
        while (right < n) {
            if (nums[right] - nums[right - 1] == nums[right - 1] - nums[left]) {
                count += right - left - 1;
                right++;
            } else {
                left = right - 1;
            }
        }
        return count;
    }
    
}
