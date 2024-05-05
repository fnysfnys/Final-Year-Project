function twoSum(nums, target) {
   nums.forEach((num, i) => {
       nums.forEach((num2, j) => {
           if (num + num2 === target) {
               return [i, j];
           }
       });
   });
   return [];
}
