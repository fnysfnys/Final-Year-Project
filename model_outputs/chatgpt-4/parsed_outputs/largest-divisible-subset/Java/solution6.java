import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> dp = new ArrayList<>();
        for (int num : nums) {
            dp.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.length; i++) {
            List<Integer> maxSubset = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp.get(j).size() > maxSubset.size()) {
                    maxSubset = dp.get(j);
                }
            }
            dp.get(i).addAll(maxSubset);
            dp.get(i).add(nums[i]);
        }

        List<Integer> result = new ArrayList<>();
        for (List<Integer> subset : dp) {
            if (subset.size() > result.size()) {
                result = subset;
            }
        }
        return result;
    }
}