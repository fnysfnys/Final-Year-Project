const prime = 113;

var numDistinct = function(s, t) {
  const m = s.length, n = t.length;
  const sHash = rollingHash(s, n);
  const tHash = rollingHash(t);
  let ans = 0;
  
  for (let i = 0; i < m - n + 1; i++) {
    const subHash = rollingHash(s.slice(i, i + n));
    if (sHash === subHash && checkEqual(s.slice(i, i + n), t)) {
      ans++;
    }
  }
  
  return ans;
};

function rollingHash(str, len) {
  let hash = 0;
  for (let i = 0; i < len; i++) {
    hash = (hash * prime + str.charCodeAt(i)) % MOD;
  }
  return hash;
}

function checkEqual(str1, str2) {
  for (let i = 0; i < str1.length; i++) {
    if (str1[i] !== str2[i]) return false;
  }
  return true;
}
