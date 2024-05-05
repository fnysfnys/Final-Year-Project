import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        Map<Integer, Integer> memo = new HashMap<>();
        return countSlices(nums, 0, memo);
    }



    private int countSlices(int[] nums, int start, Map<Integer, Integer> memo) {
        if (start >= nums.length - 2) return 0;
        if (memo.containsKey(start)) return memo.get(start);

        int count = 0;
        for (int end = start + 2; end < nums.length; end++) {
            if (isArithmetic(nums, start, end)) {
                count++;
            } else {
                break;
            }
        }
        count += countSlices(nums, start + 1, memo);
        memo.put(start, count);
        return count;
    }

    private boolean isArithmetic(int[] nums, int start, int end) {
        int diff = nums[start + 1] - nums[start];
        for (int i = start + 1; i < end; i++) {
            if (nums[i + 1] - nums[i] != diff) return false;
        }
        return true;
    }
}
