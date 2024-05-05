const hammingWeight = (n) => {
  // Assuming a built-in hamming weight function exists
  let count = 0;
  while (n) {
    count += n & 1;
    n >>>= 1;
  }
  return count;
};

function countBits(n) {
  const ans = new Array(n + 1).fill(0);
  for (let i = 0; i <= n; i++) {
    ans[i] = hammingWeight(i);
  }
  return ans;
}
