class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex / 2; i++) {
            row.add((int) (factorial(rowIndex) / (factorial(i) * factorial(rowIndex - i))));
        }
        int size = row.size();
        for (int i = size - 1; i >= 0; i--) {
            row.add(row.get(i));
        }
        return row;
    }
    
}
