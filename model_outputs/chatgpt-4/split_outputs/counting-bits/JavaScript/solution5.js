   var countBits = function(n) {
       return Array.from({length: n + 1}, (_, i) => i.toString(2).split('1').length - 1);
   };
   