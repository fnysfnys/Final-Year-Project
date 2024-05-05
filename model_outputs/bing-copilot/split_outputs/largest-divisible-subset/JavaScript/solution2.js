   var largestDivisibleSubset = function(nums) {
       nums.sort((a, b) => b - a);
       const result = [];

       for (const num of nums) {
           if (result.length === 0 || num % result[result.length - 1] === 0) {
               result.push(num);
           }
       }

       return result;
   };
   