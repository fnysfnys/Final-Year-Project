function integerReplacement(n) {
   let table = new Array(n + 1);
   table[0] = 0;
   for (let i = 1; i <= n; i++) {
       if (i % 2 === 0) {
           table[i] = 1 + table[i / 2];
       } else {
           table[i] = 1 + table[i + 1];
       }
   }
   return table[n];
}
