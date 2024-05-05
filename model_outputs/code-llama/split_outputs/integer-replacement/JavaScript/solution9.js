function integerReplacement(n) {
   let memo = new Map();
   memo.set(0, 0);
   for (let i = 1; i <= n; i++) {
       if (i % 2 === 0) {
           memo.set(i, 1 + memo.get(i / 2));
       } else {
           memo.set(i, 1 + memo.get(i + 1));
       }
   }
   return memo.get(n);
}
