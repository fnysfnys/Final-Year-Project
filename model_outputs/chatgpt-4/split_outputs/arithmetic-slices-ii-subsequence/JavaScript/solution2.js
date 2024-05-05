   /**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       let count = 0;
       const map = new Map();
       
       for (let i = 0; i < nums.length; i++) {
           for (let j = i + 1; j < nums.length; j++) {
               let diff = nums[j] - nums[i];
               if (!map.has(diff)) {
                   map.set(diff, new Set());
               }
               map.get(diff).add([i, j]);
           }
       }

       for (let [diff, pairs] of map) {
           count += pairs.size;
       }

       return count;
   };
   