class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
       int count = 0;
       for (int i = 0; i < nums.length - 2; i++) {
           for (int j = i + 1; j < nums.length - 1; j++) {
               int diff = nums[j] - nums[i];
               int index = Arrays.binarySearch(nums, i + 1, j, diff);
               if (index != -1) {
                   count++;
               }
           }
       }
       return count;
    }
    
}
