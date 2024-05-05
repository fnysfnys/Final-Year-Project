   var getMaxRepetitions = function(s1, n1, s2, n2) {
       const lastIndex = new Map();
       let j = 0, count = 0;
       for (let i = 0; i < n1; i++) {
           for (const char of s1) {
               if (char === s2[j]) {
                   j++;
                   if (j === s2.length) {
                       j = 0;
                       count++;
                   }
               }
           }
           if (lastIndex.has(j)) {
               const prevCount = lastIndex.get(j);
               const patternCount = count - prevCount;
               const remainingRepetitions = n1 - i - 1;
               count += Math.floor(remainingRepetitions / (i - prevCount)) * patternCount;
               i = n1 - remainingRepetitions % (i - prevCount);
           }
           lastIndex.set(j, count);
       }
       return Math.floor(count / n2);
   };
   