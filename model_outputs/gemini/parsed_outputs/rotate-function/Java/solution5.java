class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int[] sums = new int[n];
        int[] F = new int[n];
        sums[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 1; i < n; i++) {
            F[i] = (n - i) * nums[i] + sums[i - 1] - F[i - 1];
        }
        return Arrays.stream(F).max().getAsInt();
    }
    
}
