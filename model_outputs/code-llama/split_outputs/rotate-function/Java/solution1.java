public int maxRotateFunction(int[] nums) {
   int n = nums.length;
   int[] arr = new int[n];
   for (int i = 0; i < n; i++) {
       arr[i] = nums[i];
   }
   int max = 0;
   for (int i = 0; i < n; i++) {
       int sum = 0;
       for (int j = 0; j < n; j++) {
           sum += arr[(i + j) % n] * j;
       }
       max = Math.max(max, sum);
   }
   return max;
}
