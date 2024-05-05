function countBits(n) {
   let ans = [];
   for (let i = 0; i <= n; i++) {
       ans[i] = 0;
   }
   for (let i = 1; i <= n; i++) {
       ans[i] = ans[i - 1] + 1;
   }
   return ans;
}
