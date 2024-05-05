function numDistinct(s, t) {
   let count = 0;
   for (let i = 0; i < s.length; i++) {
       let window = s.substring(i, i + t.length);
       if (window === t) {
           count++;
       }
   }
   return count;
}
