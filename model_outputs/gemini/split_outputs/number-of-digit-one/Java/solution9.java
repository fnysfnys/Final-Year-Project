public int countDigitOne(int n) {
  int count = 0;
  for (int i = 1; i <= n; i++) {
    count += Ints.asList(String.valueOf(i).split("")).contains(1) ? 1 : 0;
  }
  return count;
}