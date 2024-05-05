public List<Integer> getRow(int rowIndex) {
  if (rowIndex == 0) {
    return Arrays.asList(1);
  }
  List<Integer> prevRow = getRow(rowIndex - 1);
  List<Integer> currRow = new ArrayList<>();
  for (int i = 0; i <= rowIndex; i++) {
    if (i == 0 || i == rowIndex) {
      currRow.add(1);
    } else {
      currRow.add(prevRow.get(i - 1) + prevRow.get(i));
    }
  }
  return currRow;
}
