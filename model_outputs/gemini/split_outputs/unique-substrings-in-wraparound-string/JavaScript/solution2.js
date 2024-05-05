function findSubstringInWraproundString(s) {
  const counts = new Array(26).fill(0);
  let prevLen = 1;
  let res = 0;
  
  for (const char of s) {
    const index = char.charCodeAt() - 'a'.charCodeAt();
    counts[index] = Math.max(counts[index], prevLen);
    res += counts[index];
    prevLen = (index > 0 && char.charCodeAt() - 1 === String.fromCharCode('a'.charCodeAt() + index - 1).charCodeAt()) ? prevLen + 1 : 1;
  }
  
  return res;
}
