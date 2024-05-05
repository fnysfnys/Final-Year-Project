/**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       const memo = new Map();

       function countSlices(start, diff) {
           if (start >= nums.length) return 0;
           let key = `${start}-${diff}`;
           if (memo.has(key)) return memo.get(key);

           let total = 0;
           for (let i = start + 1; i < nums.length; i++) {
               if (nums[i] - nums[start] === diff) {
                   total += 1 + countSlices(i, diff);
               }
           }

           memo.set(key, total);
           return total;
       }

       let totalCount = 0;
       for (let i = 0; i < nums.length - 2; i++) {
           for (let j = i + 1; j < nums.length - 1; j++) {
               totalCount += countSlices(j, nums[j] - nums[i]);
           }
       }

       return totalCount;
   };