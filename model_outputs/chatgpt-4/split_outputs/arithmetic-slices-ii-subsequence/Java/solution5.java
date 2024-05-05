import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int diff = nums[j] -

nums[i];
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] - nums[j] == diff) {
                        String key = i + ":" + j + ":" + k;
                        if (!set.contains(key)) {
                            set.add(key);
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
