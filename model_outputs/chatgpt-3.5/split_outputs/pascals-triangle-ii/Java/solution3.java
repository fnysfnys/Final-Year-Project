public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    for (int i = 0; i <= rowIndex; i++) {
        row.add(getValue(rowIndex, i));
    }
    return row;
}

private int getValue(int row, int col) {
    if (col == 0 || col == row) {
        return 1;
    }
    return getValue(row - 1, col - 1) + getValue(row - 1, col);
}
