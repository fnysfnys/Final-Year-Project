public List<List<Integer>> generate(int numRows) {
    if (numRows == 1) {
        return Collections.singletonList(Collections.singletonList(1));
    }

    List<List<Integer>> prevRows = generate(numRows - 1);
    List<Integer> currRow = new ArrayList<>();
    currRow.add(1);

    for (int i = 1; i < numRows - 1; i++) {
        currRow.add(prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
    }

    currRow.add(1);
    prevRows.add(currRow);
    return prevRows;
}
