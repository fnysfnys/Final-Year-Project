function numDistinct(s, t) {
   let count = 0;
   let suffixAutomaton = {};
   for (let i = 0; i < s.length; i++) {
       let node = suffixAutomaton;
       for (let j = i; j < s.length; j++) {
           if (!node[s[j]]) {
               node[s[j]] = {};
           }
           node = node[s[j]];
       }
   }
   for (let i = 0; i < t.length; i++) {
       let node = suffixAutomaton;
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
