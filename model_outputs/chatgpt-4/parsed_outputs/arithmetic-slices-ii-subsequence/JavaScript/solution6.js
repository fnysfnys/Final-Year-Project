/**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       let count = 0;
       let differences = new Array(nums.length - 1);
       for (let i = 0; i < differences.length; i++) {
           differences[i] = nums[i + 1] - nums[i];
       }

       for (let i = 0; i < differences.length; i++) {
           let j = i;
           while (j < differences.length && differences[j] === differences[i]) {
               j++;
           }
           let length = j - i;
           if (length >= 2) {
               count += (length * (length - 1)) / 2;
           }
           i = j - 1;
       }

       return count;
   };