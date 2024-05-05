function countNumbersWithUniqueDigits(n) {
  if (n === 0) return 1;
  const allowed = (1 << 10) - 1;
  let count = 0;
  for (let i = allowed; i > 0; i = (i - 1) & allowed) {
    const used = i.toString(2).length - i.toString(2).replace(/1/g, "").length;
    if (used === n) {
      count++;
    }
  }
  return count;
}
