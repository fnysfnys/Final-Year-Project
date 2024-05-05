function maxCoins(nums) {
   let coins = 0;
   for (let i = 0; i < nums.length; i++) {
       coins += nums[i - 1] * nums[i] * nums[i + 1];
   }
   return coins;
}
