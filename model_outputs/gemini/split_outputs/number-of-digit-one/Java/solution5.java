public int countDigitOne(int n) {
  int ones = 0;
  for (int i = 1; i <= 9; i++) {
    ones += (n / i + 1) * i;
  }
  ones -= (n / 10 + 1) * 9;
  return ones;
}
