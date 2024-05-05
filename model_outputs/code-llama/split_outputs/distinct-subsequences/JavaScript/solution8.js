function numDistinct(s, t) {
   let count = 0;
   let suffixTree = {};
   for (let i = 0; i < s.length; i++) {
       let node = suffixTree;
       for (let j = i; j < s.length; j++) {
           if (!node[s[j]]) {
               node[s[j]] = {};
           }
           node = node[s[j]];
       }
   }
   let hash = {};
   for (let i = 0; i < t.length; i++) {
       let node = suffixTree;
       for (let j = 0; j < t[i].length; j++) {
           if (!node[t[i][j]]) {
               count++;
               break;
           }
           node = node[t[i][j]];
       }
       hash[t[i]] = count;
   }
   return count;
}
