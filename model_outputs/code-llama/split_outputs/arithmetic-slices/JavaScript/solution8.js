function numberOfArithmeticSlices(nums) {
   const window = new Array(3).fill(0);
   let count = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       window.shift();
       window.push(nums[i]);
       if (window[1] - window[0] === window[2] - window[1]) {
           count++;
       }
   }
   return count;
}
