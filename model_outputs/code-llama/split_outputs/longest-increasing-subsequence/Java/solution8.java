public int lengthOfLIS(int[] nums) {
   TreeSet<Integer> set = new TreeSet<>();
   for (int i = 0; i < nums.length; i++) {
       set.add(nums[i]);
   }
   return set.size();
}
