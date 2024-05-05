   /**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       let uniqueSequences = new Set();
       for (let i = 0; i < nums.length - 2; i++) {
           for (let j = i + 1; j < nums.length - 1; j++) {
               let diff = nums[j] - nums[i];
               for (let k = j + 1; k < nums.length; k++) {
                   if (nums[k] - nums[j] === diff) {
                       uniqueSequences.add(`${nums[i]}-${diff}-${k - i}`);
                   }
               }
           }
       }
       return uniqueSequences.size;
   };
   