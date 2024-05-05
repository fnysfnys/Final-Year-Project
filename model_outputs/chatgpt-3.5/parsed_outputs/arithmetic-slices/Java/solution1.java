class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        for (int start = 0; start < nums.length - 2; start++) {
            int diff = nums[start + 1] - nums[start];
            for (int end = start + 2; end < nums.length; end++) {
                if (nums[end] - nums[end - 1] == diff) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
