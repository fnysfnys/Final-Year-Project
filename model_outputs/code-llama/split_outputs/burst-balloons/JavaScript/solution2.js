function maxCoins(nums) {
   let coins = 0;
   nums.forEach((num, i) => {
       coins += num * nums[i - 1] * nums[i + 1];
   });
   return coins;
}
