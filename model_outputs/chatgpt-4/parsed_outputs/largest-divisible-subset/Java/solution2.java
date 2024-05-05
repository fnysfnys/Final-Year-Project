import java.util.*;

class Solution {
    private void backtrack(int[] nums, int start, List<Integer> current, List<Integer> best) {
        if (current.size() > best.size()) {
            best.clear();
            best.addAll(current);
        }

        for (int i = start; i < nums.length; i++) {
            if (current.isEmpty() || nums[i] % current.get(current.size() - 1) == 0) {
                current.add(nums[i]);
                backtrack(nums, i + 1, current, best);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
}