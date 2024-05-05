function splitArray(nums, k) {
   let mid = Math.floor(nums.length / k);
   let left = nums.slice(0, mid);
   let right = nums.slice(mid);
   let leftSum = 0;
   let rightSum = 0;
   for (let i = 0; i < left.length; i++) {
       leftSum += left[i];
   }
   for (let i = 0; i < right.length; i++) {
       rightSum += right[i];
   }
   return leftSum + rightSum;
}
