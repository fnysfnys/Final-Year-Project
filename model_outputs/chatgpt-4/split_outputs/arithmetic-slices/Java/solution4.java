class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int left = 0;
        while (left < nums.length - 2) {
            int right = left + 1;
            int diff = nums[right] - nums[left];
            while (right < nums.length - 1 && nums[right + 1] - nums[right] == diff) {
                right++;
            }
            int length = right - left + 1;
            if (length >= 3) {
                count += (length - 1) * (length - 2) / 2;
            }
            left = right;
        }
        return count;
    }
}
