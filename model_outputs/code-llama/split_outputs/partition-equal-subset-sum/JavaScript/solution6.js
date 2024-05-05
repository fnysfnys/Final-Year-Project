function canPartition(nums) {
   const sum = nums.reduce((a, b) => a + b, 0);
   if (sum % 2 !== 0) return false;
   const halfSum = sum / 2;
   const map = new Map();
   for (const num of nums) {
       if (map.has(num)) return false;
       map.set(num, true);
   }
   nums.sort((a, b) => b - a);
   let currentSum = 0;
   for (const num of nums) {
       if (currentSum + num <= halfSum) {
           currentSum += num;
       } else {
           break;
       }
   }
   return currentSum === halfSum;
}
