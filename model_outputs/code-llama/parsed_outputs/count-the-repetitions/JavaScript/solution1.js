function getMaxRepetitions(s1, n1, s2, n2) {
   let counter = 0;
   for (let i = 0; i < s1.length; i++) {
       for (let j = 0; j < s2.length; j++) {
           if (s1[i] === s2[j]) {
               counter++;
           }
       }
   }
   return counter;
}
