function integerReplacement(n) {
   for (let i = 0; i < n; i++) {
       if (n % 2 === 0) {
           n /= 2;
       } else {
           n += 1;
       }
   }
   return n;
}
