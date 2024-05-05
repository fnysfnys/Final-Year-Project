function twoSum(nums, target) {
   let i = 0;
   let j = 0;
   while (i < nums.length && j < nums.length) {
       if (nums[i] + nums[j] === target) {
           return [i, j];
       }
       i++;
       j++;
   }
   return [];
}
