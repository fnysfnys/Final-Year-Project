import java.util.*;

class Solution {
    private int binarySearch(List<Integer> list, int target

) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        int maxIndex = 0;

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                    if (dp[i] > dp[maxIndex]) {
                        maxIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = maxIndex; i != -1; i = prev[i]) {
            result.add(nums[i]);
        }

        Collections.reverse(result);
        return result;
    }
}
