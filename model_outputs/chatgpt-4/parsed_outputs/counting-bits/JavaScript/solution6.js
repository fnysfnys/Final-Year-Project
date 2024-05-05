var countBits = function(n) {
       var ans = new Array(n + 1).fill(0);
       ans.forEach((_, i) => {
           ans[i] = ans[i >> 1] + (i & 1);
       });
       return ans;
   };