function integerBreak(n) {
  const factors = [1, 1, 2, 2];
  if (n <= 4) return factors[n];
  let product = 2;
  let temp1 = 3;
  let temp2 = 2;
  for (let i = 5; i <= n; i++) {
    let temp = Math.max(temp1 * 2, Math.max(temp2 * 3, product * 3));
    product = temp;
    temp1 = temp2;
    temp2 = temp;
  }
  return product;
}
