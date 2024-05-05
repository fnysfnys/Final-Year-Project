function countBits(n) {
   let ans = [];
   for (let i = 0; i <= n; i++) {
       ans[i] = Math.floor(Math.log2(i)) + 1;
   }
   return ans;
}
