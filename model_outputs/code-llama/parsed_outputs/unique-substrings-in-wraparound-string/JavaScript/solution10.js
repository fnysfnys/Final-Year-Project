function findSubstringInWraproundString(s) {
   const base = "abcdefghijklmnopqrstuvwxyz";
   let count = 0;
   for (let i = 0; i < s.length; i++) {
       const substring = s.substring(i, i + 1);
       if (!base.includes(substring)) {
           continue;
       }
       count++;
       break;
   }
   return count;
}
