function countBits(n) {
   let ans = [];
   for (let i = 0; i <= n; i++) {
       ans[i] = i & (i - 1);
   }
   return ans;
}
