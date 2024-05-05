import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, List<Integer>> subsets = new HashMap<>();
        List<Integer> maxSubset = new ArrayList<>();

        for (int num : nums) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int key : subsets.keySet()) {
                if (num % key == 0 && subsets.get(key).size() > currentSubset.size()) {
                    currentSubset = new ArrayList<>(subsets.get(key));
                }
            }
            currentSubset.add(num);
            subsets.put(num, currentSubset);
            if (currentSubset.size() > maxSubset.size()) {
                maxSubset = currentSubset;
            }
        }

        return maxSubset;
    }
}
