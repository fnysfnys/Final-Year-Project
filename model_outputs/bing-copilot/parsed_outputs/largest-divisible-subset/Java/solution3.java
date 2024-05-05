import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> maxCount = new HashMap<>();
        
        for (int num : nums) {
            int count = 0;
            for (int i = 2; i * i <= num; i++) {
                while (num % i == 0) {
                    num /= i;
                    count = Math.max(count, maxCount.getOrDefault(i, 0) + 1);
                }
            }
            if (num > 1) {
                count = Math.max(count, maxCount.getOrDefault(num, 0) + 1);
            }
            maxCount.put(num, count);
        }
        
        int maxCountValue = Collections.max(maxCount.values());
        List<Integer> largestSubset = new ArrayList<>();
        for (int num : maxCount.keySet()) {
            if (maxCount.get(num) == maxCountValue) {
                largestSubset.add(num);
            }
        }
        return largestSubset;
    }
}
