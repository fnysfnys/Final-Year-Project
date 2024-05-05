function integerBreak(n) {
   let low = 1;
   let high = n;
   while (low <= high) {
       let mid = Math.floor((low + high) / 2);
       if (mid * (mid + 1) / 2 >= n) {
           high = mid - 1;
       } else {
           low = mid + 1;
       }
   }
   return low;
}
