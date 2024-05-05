class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return 0;
        }
    
        int count = 0;
        int current = 0;
        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current++;
            } else {
                count += (current * (current + 1)) / 2; // Arithmetic series formula
                current = 0;
            }
        }
        count += (current * (current + 1)) / 2; // Add the count for the last arithmetic slice
        return count;
    }
    
}
