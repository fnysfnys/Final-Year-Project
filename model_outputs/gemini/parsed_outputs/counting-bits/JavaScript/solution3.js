function countBits(n) {
  const table = [0, 1, 1, 2, 1, 2];
  const ans = new Array(n + 1).fill(0);
  for (let i = 0; i <= n; i++) {
    ans[i] = table[i & 7] + table[(i >> 3) & 7] + table[(i >> 6) & 7] + table[(i >> 9) & 7];
  }
  return ans;
}
