function canPartition(nums) {
   const sum = nums.reduce((a, b) => a + b, 0);
   if (sum % 2 !== 0) return false;
   const halfSum = sum / 2;
   const map = new Map();
   for (const num of nums) {
       if (map.has(num)) return false;
       map.set(num, true);
   }
   const dp = new Array(nums.length + 1).fill(false);
   dp[0] = true;
   for (let i = 1; i <= nums.length; i++) {
       for (let j = 0; j < i; j++) {
           if (dp[j] && nums[j] <= halfSum - nums[i]) {
               dp[i] = true;
               break;
           }
       }
   }
   return dp[nums.length];
}
