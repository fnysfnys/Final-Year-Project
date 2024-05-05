public int countDigitOne(int n) {
  int count = 0;
  for (int i = 1; i <= n; i++) {
    count += String.valueOf(i).chars().filter(c -> c == '1').count();
  }
  return count;
}
