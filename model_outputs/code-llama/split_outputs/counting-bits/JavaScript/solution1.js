function countBits(n) {
   let ans = [];
   for (let i = 0; i <= n; i++) {
       ans[i] = i.toString(2).split('').filter(x => x === '1').length;
   }
   return ans;
}
