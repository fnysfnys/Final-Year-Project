import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, TreeSet<Integer>> subsets = new HashMap<>();
        TreeSet<Integer> maxSubset = new TreeSet<>();

        for (int num : nums) {
            TreeSet<Integer> currentSubset = new TreeSet<>();
            for (int key : subsets.keySet()) {
                if (num % key == 0 && subsets.get(key).size() > currentSubset.size()) {
                    currentSubset = new TreeSet<>(subsets.get(key));
                }
            }
            currentSubset.add(num);
            subsets.put(num, currentSubset);
            if (currentSubset.size() > maxSubset.size()) {
                maxSubset = currentSubset;
            }
        }

        return new ArrayList<>(maxSubset);
    }
}