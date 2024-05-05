function countBits(n) {
  const ans = new Array(n + 1).fill(0);
  for (let i = 0; i <= n; i++) {
    let count = 0;
    let num = i;
    while (num) {
      count += num & 1;
      num >>= 1;
    }
    ans[i] = count;
  }
  return ans;
}
