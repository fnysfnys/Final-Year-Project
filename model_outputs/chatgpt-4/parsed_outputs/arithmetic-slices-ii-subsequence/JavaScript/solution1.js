/**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       let count = 0;
       for (let i = 0; i < nums.length - 2; i++) {
           for (let j = i + 1; j < nums.length - 1; j++) {
               let diff = nums[j] - nums[i];
               for (let k = j + 1; k < nums.length; k++) {
                   if (nums[k] - nums[j] === diff) {
                       count++;
                   }
               }
           }
       }
       return count;
   };