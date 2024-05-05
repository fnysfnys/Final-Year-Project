function integerBreak(n) {
  let maxProduct = 1;
  for (let i = 2; i < n; i++) {
    for (let j = 1; j < i; j++) {
      const product = Math.max(j, n - j) * Math.max(i, n - i);
      maxProduct = Math.max(maxProduct, product);
    }
  }
  return maxProduct;
}
