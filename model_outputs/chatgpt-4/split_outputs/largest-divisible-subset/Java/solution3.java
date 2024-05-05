import java.util.*;

class Solution {
    private HashMap<Integer, List<Integer>> memo = new HashMap<>();

    private List<Integer> findSubset(int[] nums, int index) {
        if (index == nums.length) return new ArrayList<>();
        if (memo.containsKey(index)) return memo.get(index);

        List<Integer> bestSubset = new ArrayList<>();
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] % nums[index] == 0) {
                List<Integer> subset = findSubset(nums, i);
                if (subset.size() > bestSubset.size()) {
                    bestSubset = new ArrayList<>(subset);
                }
            }
        }

        bestSubset.add(0, nums[index]);
        memo.put(index, bestSubset);
        return bestSubset;
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> subset = findSubset(nums, i);
            if (subset.size() > result.size()) {
                result = subset;
            }
        }

        return result;
    }
}
