function numDistinct(s, t) {
   let count = 0;
   for (let i = 0; i < s.length; i++) {
       for (let j = 0; j < t.length; j++) {
           if (s[i] === t[j]) {
               count++;
           }
       }
   }
   return count;
}
