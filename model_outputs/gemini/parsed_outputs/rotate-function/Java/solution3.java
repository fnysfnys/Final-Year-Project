class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int prevSum = 0, maxSum = 0, totalSum = 0;
        for (int num : nums) {
            prevSum = Math.max(0, prevSum + num);
            maxSum = Math.max(maxSum, prevSum);
            totalSum += num;
        }
        return maxSum == totalSum ? 0 : totalSum - maxSum;
    }
    
}
