   var getMaxRepetitions = function(s1, n1, s2, n2) {
       function canObtainFromS1(s1, s2) {
           let i = 0;
           for (const char of s1) {
               if (char === s2[i]) {
                   i++;
                   if (i === s2.length) {
                       i = 0;
                   }
               }
           }
           return i === 0;
       }
       
       let count = 0;
       for (let i = 0; i < n1; i++) {
           if (canObtainFromS1(s1, s2)) {
               count++;
           }
       }
       return Math.floor(count / n2);
   };
   