public List<Integer> getRow(int rowIndex) {
  List<Integer> result = new ArrayList<>();
  int num = 1;
  for (int i = 0; i <= rowIndex; i++) {
    result.add(num);
    num = (num << 1) - num;
  }
  return result;
}
