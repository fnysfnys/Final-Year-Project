import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            boolean canAdd = true;
            for (int r : result) {
                if (num % r != 0 && r % num != 0) {
                    canAdd = false;
                    break;
                }
            }
            if (canAdd) {
                result.add(num);
            }
        }
        return result;
    }
}