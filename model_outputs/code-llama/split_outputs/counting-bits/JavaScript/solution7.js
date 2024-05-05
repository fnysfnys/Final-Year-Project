function countBits(n) {
   let ans = [];
   for (let i = 0; i <= n; i++) {
       ans[i] = ans[i - 1] + 1;
   }
   return ans;
}
