public int numberOfArithmeticSlices(int[] nums) {
   int count = 0;
   for (int i = 0; i < nums.length - 2; i++) {
       for (int j = i + 1; j < nums.length - 1; j++) {
           if (nums[j] - nums[i] == nums[j + 1] - nums[j]) {
               count++;
           }
       }
   }
   return count;
}
