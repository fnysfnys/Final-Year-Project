public int[] twoSum(int[] nums, int target) {
   for (int i = 0; i < nums.length; i++) {
       int complement = target - nums[i];
       if (nums[i] == complement) {
           return new int[] {i, i};
       }
       int mask = 1 << (31 - Integer.numberOfLeadingZeros(complement));
       while (mask != 0) {
           if ((complement & mask) != 0) {
               return new int[] {i, i + mask};
           }
           mask >>= 1;
       }
   }
   return null;
}
