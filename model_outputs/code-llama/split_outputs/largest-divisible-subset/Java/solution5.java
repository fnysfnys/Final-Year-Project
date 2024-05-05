public List<Integer> largestDivisibleSubset(int[] nums) {
   List<Integer> result = new ArrayList<>();
   Map<Integer, Integer> map = new HashMap<>();
   for (int i = 0; i < nums.length; i++) {
       if (map.containsKey(nums[i])) {
           result.add(nums[i]);
       }
   }
   return result;
}
