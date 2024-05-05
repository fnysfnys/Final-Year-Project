function lengthOfLIS(nums) {
   if (nums.length === 1) {
       return 1;
   }
   let mid = Math.floor(nums.length / 2);
   let left = lengthOfLIS(nums.slice(0, mid));
   let right = lengthOfLIS(nums.slice(mid, nums.length));
   return Math.max(left, right);
}
