class Solution {
    public int splitArray(int[] nums, int k) {
        long left = 0;
        long right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            int count = split(nums, mid);
            
            if (count > k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return (int) left;
    }
    
    private int split(int[] nums, long maxSum) {
        int count = 1;
        long currentSum = 0;
        
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }
        
        return count;
    }
}
