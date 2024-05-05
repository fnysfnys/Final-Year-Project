class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int k = 0; k < n; k++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int rotatedIndex = (i + k) % n;
                sum += i * nums[rotatedIndex];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
    
}
