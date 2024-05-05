public int countDigitOne(int n) {
  int count = 0;
  for (int i = 1; i <= n; i++) {
    count += StringUtils.countMatches(String.valueOf(i), "1");
  }
  return count;
}
