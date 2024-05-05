public int[] twoSum(int[] nums, int target) {
   for (int i = 0; i < nums.length; i++) {
       int complement = target - nums[i];
       int index = Arrays.binarySearch(nums, complement);
       if (index >= 0) {
           return new int[] {i, index};
       }
   }
   return null;
}
