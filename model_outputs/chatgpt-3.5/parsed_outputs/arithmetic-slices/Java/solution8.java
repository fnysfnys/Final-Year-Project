class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int start = 0; start < n - 2; start++) {
            int diff = nums[start + 1] - nums[start];
            count += countArithmeticSlices(nums, start, diff);
        }
        
        return count;
    }
    
    private int countArithmeticSlices(int[] nums, int start, int diff) {
        int count = 0;
        for (int end = start + 2; end < nums.length; end++) {
            if (nums[end] - nums[end - 1] == diff) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
