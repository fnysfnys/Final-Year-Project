public int numberOfArithmeticSlices(int[] nums) {
   int count = 0;
   Set<Integer> diffs = new HashSet<>();
   for (int i = 0; i < nums.length - 1; i++) {
       diffs.add(nums[i + 1] - nums[i]);
   }
   for (int i = 0; i < nums.length - 2; i++) {
       for (int j = i + 1; j < nums.length - 1; j++) {
           if (diffs.contains(nums[j] - nums[i])) {
               count++;
           }
       }
   }
   return count;
}
