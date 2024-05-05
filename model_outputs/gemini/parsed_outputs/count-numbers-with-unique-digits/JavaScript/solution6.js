function countNumbersWithUniqueDigits(n) {
  if (n === 0) return 1;
  const digits = "0123456789".slice(0, n);
  let count = 0;
  for (let i = 0; i < Math.pow(10, n); i++) {
    const num = String(i).padStart(n, "0");
    if (new Set(num).size === num.length) {
      count++;
    }
  }
  return count;
}
