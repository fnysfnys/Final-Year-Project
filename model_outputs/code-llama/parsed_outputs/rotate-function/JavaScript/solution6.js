function maxRotateFunction(nums) {
   return nums.map(num => num * num).reduce((acc, curr) => acc + curr, 0);
}
