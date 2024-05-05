function findSubstringInWraproundString(s) {
   const base = "abcdefghijklmnopqrstuvwxyz";
   const regex = new RegExp(`[${base}]`, "g");
   const matches = s.match(regex);
   return matches ? matches.length : 0;
}
