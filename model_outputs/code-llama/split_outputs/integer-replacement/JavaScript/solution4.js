function integerReplacement(n) {
   if (n === 1) {
       return 0;
   }
   let count = 0;
   while (n !== 1) {
       if (n % 2 === 0) {
           n /= 2;
       } else {
           n += 1;
       }
       count++;
   }
   return count;
}
