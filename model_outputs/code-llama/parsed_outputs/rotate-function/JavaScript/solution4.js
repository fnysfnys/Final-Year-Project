function maxRotateFunction(nums) {
   let result = 0;
   nums.forEach((num, i) => result += i * num);
   return result;
}
