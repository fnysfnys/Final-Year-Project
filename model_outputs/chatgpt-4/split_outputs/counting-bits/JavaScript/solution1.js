   var countBits = function(n) {
       var ans = [];
       for (var i = 0; i <= n; i++) {
           ans.push(i.toString(2).split('1').length - 1);
       }
       return ans;
   };
   