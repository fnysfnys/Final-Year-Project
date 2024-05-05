   function countOnes(n) {
       if (n === 0) return 0;
       return (n & 1) + countOnes(n >> 1);
   }

   var countBits = function(n) {
       var ans = [];
       for (var i = 0; i <= n; i++) {
           ans.push(countOnes(i));
       }
       return ans;
   };
   