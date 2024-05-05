function numDistinct(s, t) {
   let count = 0;
   let suffixArray = [];
   for (let i = 0; i < s.length; i++) {
       suffixArray.push(s.substring(i));
   }
   for (let i = 0; i < t.length; i++) {
       for (let j = 0; j < suffixArray.length; j++) {
           if (suffixArray[j] === t[i]) {
               count++;
               break;
           }
       }
   }
   return count;
}
