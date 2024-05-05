public List<Integer> largestDivisibleSubset(int[] nums) {
   List<Integer> result = new ArrayList<>();
   for (int i = 0; i < nums.length; i++) {
       int left = 0;
       int right = nums.length - 1;
       while (left <= right) {
           int mid = (left + right) / 2;
           if (nums[i] % nums[mid] == 0) {
               result.add(nums[mid]);
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
   }
   return result;
}
