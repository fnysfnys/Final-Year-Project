public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    int[][] memo = new int[rowIndex + 1][rowIndex + 1];
    for (int i = 0; i <= rowIndex; i++) {
        row.add(getPascalValue(rowIndex, i, memo));
    }
    return row;
}

private int getPascalValue(int row, int col, int[][] memo) {
    if (col == 0 || col == row) {
        return 1;
    }
    if (memo[row][col] != 0) {
        return memo[row][col];
    }
    int value = getPascalValue(row - 1, col - 1, memo) + getPascalValue(row - 1, col, memo);
    memo[row][col] = value;
    return value;
}
