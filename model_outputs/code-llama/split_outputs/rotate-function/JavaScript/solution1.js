function maxRotateFunction(nums) {
   let result = 0;
   for (let i = 0; i < nums.length; i++) {
       result += i * nums[i];
   }
   return result;
}
