public int numberOfArithmeticSlices(int[] nums) {
   int count = 0;
   for (int i = 0; i < nums.length - 2; i++) {
       for (int j = i + 1; j < nums.length - 1; j++) {
           int diff = nums[j] - nums[i];
           int left = j + 1;
           int right = nums.length - 1;
           while (left <= right) {
               int mid = (left + right) / 2;
               if (nums[mid] - nums[j] == diff) {
                   count++;
                   left = mid + 1;
               } else {
                   right = mid - 1;
               }
           }
       }
   }
   return count;
}
