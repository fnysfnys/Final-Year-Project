function findSubstringInWraproundString(s) {
   const base = "abcdefghijklmnopqrstuvwxyz";
   const substrings = new Set();
   for (let i = 0; i < s.length; i++) {
       const substring = s.substring(i, i + 1);
       if (base.includes(substring)) {
           substrings.add(substring);
       }
   }
   return substrings.size;
}
