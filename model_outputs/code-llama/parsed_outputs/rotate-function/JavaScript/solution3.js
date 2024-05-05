function maxRotateFunction(nums) {
   return nums.map((num, i) => i * num).reduce((acc, curr) => acc + curr, 0);
}
