public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    int[] prevRow = new int[rowIndex + 1];
    int[] currRow = new int[rowIndex + 1];
    prevRow[0] = 1;
    for (int i = 1; i <= rowIndex; i++) {
        currRow[0] = 1;
        for (int j = 1; j < i; j++) {
            currRow[j] = prevRow[j - 1] + prevRow[j];
        }
        currRow[i] = 1;
        System.arraycopy(currRow, 0, prevRow, 0, i + 1);
    }
    for (int value : currRow) {
        row.add(value);
    }
    return row;
}
