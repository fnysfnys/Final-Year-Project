function integerBreak(n) {
   const memo = {};
   function helper(n) {
       if (n === 1) {
           return 1;
       }
       if (memo[n]) {
           return memo[n];
       }
       let result = 1;
       for (let i = 2; i <= n; i++) {
           result *= helper(i);
       }
       memo[n] = result;
       return result;
   }
   return helper(n);
}
