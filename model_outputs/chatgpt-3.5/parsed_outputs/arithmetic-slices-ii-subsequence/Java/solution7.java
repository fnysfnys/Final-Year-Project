class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int[] diffCount = new int[2001]; // Store the count of differences from -1000 to 1000
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j] + 1000;
                if (diff < 0 || diff > 2000) continue;
                
                int d = (int) diff;
                count += diffCount[d];
                diffCount[d]++;
            }
        }
        
        return count;
    }
}
