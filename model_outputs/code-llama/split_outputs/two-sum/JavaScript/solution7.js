function twoSum(nums, target) {
   return nums.map((num, i) => {
       return nums.map((num2, j) => {
           if (num + num2 === target) {
               return [i, j];
           }
       });
   });
}
