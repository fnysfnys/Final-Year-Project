import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] nums, int index, List<Integer> current, List<Integer> result) {
        if (index == nums.length) {
            if (current.size() > result.size()) {
                result.clear();
                result.addAll(current);
            }
            return;
        }

        if (current.isEmpty() || nums[index] % current.get(current.size() - 1) == 0) {
            current.add(nums[index]);
            dfs(nums, index + 1, current, result);
            current.remove(current.size() - 1);
        }
        dfs(nums, index + 1, current, result);
    }
}
