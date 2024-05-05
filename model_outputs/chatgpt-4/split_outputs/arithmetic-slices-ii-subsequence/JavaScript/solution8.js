   /**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       nums.sort((a, b) => a - b);
       let count = 0;
       for (let i = 0; i < nums.length - 2; i++) {
           let left = i + 1, right = i + 2;
           while (right < nums.length) {
               if (nums[right] - nums[left] === nums[left] - nums[i]) {
                   count++;
                   right++;
               } else if (nums[right] - nums[left] < nums[left] - nums[i]) {
                   right++;
               } else {
                   left++;
                   if (left == right) right++;
               }
           }
       }
       return count;
   };
   