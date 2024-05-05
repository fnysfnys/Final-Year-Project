function canPartition(nums) {
   const sum = nums.reduce((a, b) => a + b, 0);
   if (sum % 2 !== 0) return false;
   const halfSum = sum / 2;
   const set = new Set();
   for (const num of nums) {
       if (set.has(num)) return false;
       set.add(num);
   }
   for (const num of nums) {
       if (set.has(halfSum - num)) return true;
   }
   return false;
}
