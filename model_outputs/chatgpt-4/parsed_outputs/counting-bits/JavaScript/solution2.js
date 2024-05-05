var countBits = function(n) {
       var ans = [];
       for (var i = 0; i <= n; i++) {
           var count = 0;
           var num = i;
           while (num > 0) {
               count += num & 1;
               num >>= 1;
           }
           ans.push(count);
       }
       return ans;
   };