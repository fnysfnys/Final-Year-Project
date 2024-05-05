function integerReplacement(n) {
  let count = 0;
  while (n !== 1) {
    if (n % 2 === 0) {
      n >>= 1;
      count++;
    } else if (n === 3 || (n & 3) === 1) {
      n++;
      count++;
    } else {
      n--;
      count++;
    }
  }
  return count;
}
