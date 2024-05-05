import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> largestSubset = new ArrayList<>();
        
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            if (isValidSubset(subset) && subset.size() > largestSubset.size()) {
                largestSubset = subset;
            }
        }
        
        return largestSubset;
    }
    
    private boolean isValidSubset(List<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            for (int j = i + 1; j < subset.size(); j++) {
                if (subset.get(i) % subset.get(j) != 0 && subset.get(j) % subset.get(i) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
