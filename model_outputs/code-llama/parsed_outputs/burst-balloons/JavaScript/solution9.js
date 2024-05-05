function maxCoins(nums) {
   return nums.splice(0, nums.length - 1).reduce((a, b) => a * b, 1);
}
