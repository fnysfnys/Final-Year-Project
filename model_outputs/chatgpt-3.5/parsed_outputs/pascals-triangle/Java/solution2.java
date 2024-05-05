class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        generateRow(numRows, triangle);
        return triangle;
    }
    
    private void generateRow(int numRows, List<List<Integer>> triangle) {
        if (numRows == 0) return;
        generateRow(numRows - 1, triangle);
        List<Integer> row = new ArrayList<>();
        if (numRows == 1) {
            row.add(1);
        } else {
            List<Integer> prevRow = triangle.get(numRows - 2);
            row.add(1);
            for (int i = 1; i < numRows - 1; i++) {
                int sum = prevRow.get(i - 1) + prevRow.get(i);
                row.add(sum);
            }
            row.add(1);
        }
        triangle.add(row);
    }
}
