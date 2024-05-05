public int lengthOfLIS(int[] nums) {
   Map<Integer, Integer> map = new HashMap<>();
   int length = 0;
   for (int i = 0; i < nums.length; i++) {
       if (!map.containsKey(nums[i])) {
           map.put(nums[i], i);
           length++;
       }
   }
   return length;
}
