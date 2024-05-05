class Solution {
    public int splitArray(int[] nums, int k) {
        int max = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        
        int low = max, high = Arrays.stream(nums).sum();
        
        while (low < high) {
            int mid = (low + high) / 2;
            
            if (canSplit(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1, currentSum = 0;
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = 0;
            }
            currentSum += num;
        }
        return count <= k;
    }
}
