public int countDigitOne(int n) {
  if (n == 0) {
    return 0;
  }
  int lastDigit = n % 10;
  int prevCount = countDigitOne(n / 10);
  if (lastDigit == 0) {
    return prevCount;
  } else if (lastDigit == 1) {
    return prevCount + n % 10 + 1;
  } else {
    return prevCount + 10 * prevCount + 10;
  }
}
