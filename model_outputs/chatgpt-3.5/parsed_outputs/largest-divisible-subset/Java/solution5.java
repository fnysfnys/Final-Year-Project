import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(nums[i]);

            for (int j = i + 1; j < n; j++) {
                if (nums[j] % current.get(current.size() - 1) == 0) {
                    current.add(nums[j]);
                }
            }

            if (current.size() > result.size()) {
                result = current;
            }
        }

        return result;
    }
}