public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    int[] currRow = new int[rowIndex + 1];
    currRow[0] = 1;
    for (int i = 1; i <= rowIndex; i++) {
        for (int j = i; j >= 1; j--) {
            currRow[j] += currRow[j - 1];
        }
    }
    for (int value : currRow) {
        row.add(value);
    }
    return row;
}
