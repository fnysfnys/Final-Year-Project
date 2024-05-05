function numberOfArithmeticSlices(nums) {
   const binarySearch = (arr, target) => {
       let left = 0;
       let right = arr.length - 1;
       while (left <= right) {
           const mid = (left + right) >>> 1;
           if (arr[mid] === target) {
               return mid;
           } else if (arr[mid] < target) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       return -1;
   };
   let count = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       const target = nums[i + 1] - nums[i];
       const index = binarySearch(nums.slice(i + 1), target);
       if (index !== -1) {
           count++;
       }
   }
   return count;
}
