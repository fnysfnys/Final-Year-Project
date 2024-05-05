public int numberOfArithmeticSlices(int[] nums) {
   int count = 0;
   Map<Integer, Integer> diffs = new HashMap<>();
   for (int i = 0; i < nums.length - 1; i++) {
       diffs.put(nums[i], nums[i + 1] - nums[i]);
   }
   for (int i = 0; i < nums.length - 2; i++) {
       for (int j = i + 1; j < nums.length - 1; j++) {
           if (diffs.get(nums[i]) == diffs.get(nums[j])) {
               count++;
           }
       }
   }
   return count;
}
