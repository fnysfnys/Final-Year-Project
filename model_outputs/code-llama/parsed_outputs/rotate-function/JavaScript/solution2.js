function maxRotateFunction(nums) {
   return nums.reduce((acc, curr, i) => acc + i * curr, 0);
}
