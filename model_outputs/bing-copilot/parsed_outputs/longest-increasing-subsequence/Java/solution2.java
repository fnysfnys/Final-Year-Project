class Solution {
    public int lengthOfLIS(int[] nums) {
            int n = nums.length;
            int[] tails = new int[n];
            int len = 0; // Length of LIS
            
            for (int num : nums) {
                int idx = Arrays.binarySearch(tails, 0, len, num);
                if (idx < 0) {
                    idx = -(idx + 1);
                }
                tails[idx] = num;
                if (idx == len) {
                    len++;
                }
            }
            
            return len;
        }
        
}
