function integerReplacement(n) {
   let low = 0;
   let high = n;
   while (low <= high) {
       let mid = (low + high) / 2;
       if (mid % 2 === 0) {
           low = mid + 1;
       } else {
           high = mid - 1;
       }
   }
   return low;
}
