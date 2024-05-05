function numDistinct(s, t) {
   let count = 0;
   let hash = {};
   for (let i = 0; i < s.length; i++) {
       if (!hash[s[i]]) {
           hash[s[i]] = 1;
       } else {
           hash[s[i]]++;
       }
   }
   for (let i = 0; i < t.length; i++) {
       if (hash[t[i]]) {
           count++;
       }
   }
   return count;
}
