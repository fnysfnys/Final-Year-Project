/**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       function countSlices(start, end) {
           if (end - start < 2) return 0;
           let mid = Math.floor((start + end) / 2);
           let count = countSlices(start, mid) + countSlices(mid, end);

           for (let i = start; i < mid; i++) {
               for (let j = mid; j < end; j++) {
                   let diff = nums[j] - nums[i];
                   for (let k = j + 1; k < end; k++) {
                       if (nums[k] - nums[j] === diff) {
                           count++;
                       }
                   }
               }
           }

           return count;
       }

       return countSlices(0, nums.length);
   };