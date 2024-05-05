class Solution {
    public int splitArray(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int sum = Arrays.stream(nums).sum();
        int l = max, r = sum;
        while (l < r) {
            int mid = (l + r) / 2;
            if (canSplit(nums, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1, currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                currentSum = num;
                count++;
                if (count > k) return false;
            }
        }
        return true;
    }
}
