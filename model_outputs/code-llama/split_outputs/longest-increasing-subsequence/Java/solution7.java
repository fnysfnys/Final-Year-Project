public int lengthOfLIS(int[] nums) {
   LinkedList<Integer> list = new LinkedList<>();
   for (int i = 0; i < nums.length; i++) {
       int index = Collections.binarySearch(list, nums[i]);
       if (index < 0) {
           index = -index - 1;
       }
       list.add(index, nums[i]);
   }
   return list.size();
}
