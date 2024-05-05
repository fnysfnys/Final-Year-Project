import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, List<Integer>> subsets = new HashMap<>();
        List<Integer> maxSubset = new ArrayList<>();

        for (int num : nums) {
            List<Integer> currentSubset = subsets.entrySet().stream()
                .filter(entry -> num % entry.getKey() == 0)
                .map(Map.Entry::getValue)
                .max(Comparator.comparing(List::size))
                .orElse(new ArrayList<>());

            currentSubset = new ArrayList<>(currentSubset);
            currentSubset.add(num);
            subsets.put(num, currentSubset);

            if (currentSubset.size() > maxSubset.size()) {
                maxSubset = currentSubset;
            }
        }

        return maxSubset;
    }
}