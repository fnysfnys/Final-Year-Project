   var countBits = function(n) {
       var ans = [];
       for (var i = 0; i <= n; i++) {
           var binary = i.toString(2);
           var count = 0;
           for (var j = 0; j < binary.length; j++) {
               if (binary[j] === '1') count++;
           }
           ans.push(count);
       }
       return ans;
   };
   