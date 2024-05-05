function canPartition(nums) {
   const sum = nums.reduce((a, b) => a + b, 0);
   if (sum % 2 !== 0) return false;
   const halfSum = sum / 2;
   return canPartitionHelper(nums, 0, halfSum);
}

function canPartitionHelper(nums, start, target) {
   if (target === 0) return true;
   if (start >= nums.length) return false;
   for (let i = start; i < nums.length; i++) {
       if (nums[i] <= target) {
           const newTarget = target - nums[i];
           if (canPartitionHelper(nums, i + 1, newTarget)) return true;
       }
   }
   return false;
}
