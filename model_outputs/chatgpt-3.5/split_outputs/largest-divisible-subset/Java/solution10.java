import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> maxSubset = new ArrayList<>();

        for (int num : nums) {
            List<Integer> currentSubset = subsets.stream()
                .filter(subset -> subset.get(subset.size() - 1) % num == 0)
                .max(Comparator.comparing(List::size))
                .orElse(new ArrayList<>());

            currentSubset = new ArrayList<>(currentSubset);
            currentSubset.add(num);
            subsets.add(currentSubset);

            if (currentSubset.size() > maxSubset.size()) {
                maxSubset = currentSubset;
            }
        }

        return maxSubset;
    }
}
