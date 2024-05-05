class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 2;
            int diff = nums[i + 1] - nums[i];
            while (j < n && nums[j] - nums[j - 1] == diff) {
                count++;
                j++;
            }
        }
        return count;
    }
    
}
