public List<Integer> getRow(int rowIndex) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i <= rowIndex; i++) {
    result.add(combination(rowIndex, i));
  }
  return result;
}

private int combination(int n, int k) {
  if (k > n) {
    return 0;
  }
  if (k == 0 || k == n) {
    return 1;
  }
  return combination(n - 1, k - 1) + combination(n - 1, k);
}
