function numDistinct(s, t) {
   let count = 0;
   let trie = {};
   for (let i = 0; i < s.length; i++) {
       let node = trie;
       for (let j = 0; j < s[i].length; j++) {
           if (!node[s[i][j]]) {
               node[s[i][j]] = {};
           }
           node = node[s[i][j]];
       }
   }
   for (let i = 0; i < t.length; i++) {
       let node = trie;
       for (let j = 0; j < t[i].length; j++) {
           if (!node[t[i][j]]) {
               count++;
               break;
           }
           node = node[t[i][j]];
       }
   }
   return count;
}
