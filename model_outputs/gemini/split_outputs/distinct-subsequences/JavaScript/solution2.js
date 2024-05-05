const memo = {};

var numDistinct = function(s, t, i = 0, j = 0) {
  const key = i + ";" + j;
  if (memo[key]) return memo[key];
  
  if (j === t.length) return 1; // Base case: t matched
  if (i === s.length) return 0; // Base case: s exhausted
  
  const ans = numDistinct(s, t, i + 1, j) + (s[i] === t[j] ? numDistinct(s, t, i + 1, j + 1) : 0);
  memo[key] = ans;
  return ans;
};
