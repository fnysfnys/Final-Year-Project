import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, List<Integer>> memo = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> current = dfs(nums, i, memo);
            if (current.size() > result.size()) {
                result = current;
            }
        }
        return result;
    }

    private List<Integer> dfs(int[] nums, int index, Map<Integer, List<Integer>> memo) {
        if (memo.containsKey(index)) {
            return new ArrayList<>(memo.get(index));
        }

        List<Integer> current = new ArrayList<>();
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] % nums[index] == 0) {
                List<Integer> next = dfs(nums, i, memo);
                if (next.size() > current.size()) {
                    current = next;
                }
            }
        }
        current.add(nums[index]);
        memo.put(index, current);

        return current;
    }
}
