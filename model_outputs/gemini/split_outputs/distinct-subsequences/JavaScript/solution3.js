var numDistinct = function(s, t) {
  let ans = 0;
  let i = 0, j = 0;
  
  while (i < s.length) {
    if (s[i] === t[j]) {
      j++;
      if (j === t.length) {
        ans++;
        j = 0;
      }
    }
    i++;
  }
  
  return ans;
};
