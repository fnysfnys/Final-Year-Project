class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0; // Sum of all elements in nums
        int F = 0; // Initial value of the rotation function F(0)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }
        
        int maxF = F; // Initialize maxF with F(0)
        // Compute F(k) based on F(k-1) and update maxF if necessary
        for (int k = 1; k < n; k++) {
            // F(k) = F(k-1) + sum - n * nums[n-k]
            F = F + sum - n * nums[n - k];
            maxF = Math.max(maxF, F);
        }
        
        return maxF;
    }
}
