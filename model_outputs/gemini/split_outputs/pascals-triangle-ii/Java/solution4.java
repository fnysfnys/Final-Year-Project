public List<Integer> getRow(int rowIndex) {
  Integer[] currRow = new Integer[rowIndex + 1];
  currRow[0] = 1;
  for (int i = 1; i <= rowIndex; i++) {
    currRow[i] = 1;
    for (int j = i - 1; j > 0; j--) {
      currRow[j] = currRow[j - 1] + currRow[j];
    }
  }
  return Arrays.asList(currRow);
}
