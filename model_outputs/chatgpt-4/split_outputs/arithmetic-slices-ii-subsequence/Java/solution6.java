class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        return countArithmeticSlices(nums, 0, -1, 0, 0);
    }

    private int countArithmeticSlices(int[] nums, int start, int prevDiff, int count, int total) {
        if (start >= nums.length) {
            return total;
        }

        for (int i = start + 1; i < nums.length; i++) {
            int diff = nums[i] - nums[start];
            if (prevDiff == -1 || diff == prevDiff) {
                total = countArithmeticSlices(nums, i, diff, count + 1, total);
            }
        }

        if (count >= 2) {
            total++;
        }

        return total;
    }
}
