public List<Integer> getRow(int rowIndex) {
    List<Integer> row = new ArrayList<>(rowIndex + 1);
    row.add(1);
    
    for (int i = 1; i <= rowIndex; i++) {
        int prev = 1;
        for (int j = 1; j < i; j++) {
            int temp = row.get(j);
            row.set(j, prev + temp);
            prev = temp;
        }
        row.add(1);
    }
    
    return row;
}
