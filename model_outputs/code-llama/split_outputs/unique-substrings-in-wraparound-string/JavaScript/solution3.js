function findSubstringInWraproundString(s) {
   const base = "abcdefghijklmnopqrstuvwxyz";
   const substrings = [];
   for (let i = 0; i < s.length; i++) {
       const substring = s.substring(i, i + 1);
       if (base.includes(substring)) {
           substrings.push(substring);
       }
   }
   return substrings.length;
}
