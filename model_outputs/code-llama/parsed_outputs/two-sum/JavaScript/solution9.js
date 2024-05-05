function twoSum(nums, target) {
   return nums.reduce((acc, num, i) => {
       return nums.reduce((acc2, num2, j) => {
           if (num + num2 === target) {
               return [i, j];
           }
       }, acc2);
   }, []);
}
