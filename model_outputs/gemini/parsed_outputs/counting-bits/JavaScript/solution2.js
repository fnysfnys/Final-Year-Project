function countBits(n) {
  const ans = new Array(n + 1).fill(0);
  for (let i = 0; i <= n; i++) {
    ans[i] = ans[i & (i - 1)] + 1;
  }
  return ans;
}
