function findSubstringInWraproundString(s) {
  const charSet = new Set();
  let left = 0, right = 0;
  let res = 0;
  
  while (right < s.length) {
    charSet.add(s[right]);
    while (left <= right && !isConsecutive(charSet)) {
      charSet.delete(s[left]);
      left++;
    }
    res += right - left + 1;
    right++;
  }
  
  return res;
}

function isConsecutive(set) {
  const sorted = [...set].sort();
  for (let i = 1; i < sorted.length; i++) {
    if (sorted[i].charCodeAt() - sorted[i - 1].charCodeAt() !== 1) {
      return false;
    }
  }
  return true;
}
