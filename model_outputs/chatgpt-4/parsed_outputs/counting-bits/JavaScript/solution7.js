var countBits = function(n) {
       var ans = [0];
       for (var i = 1; i <= n; i++) {
           ans[i] = ans[i & (i - 1)] + 1;
       }
       return ans;
   };