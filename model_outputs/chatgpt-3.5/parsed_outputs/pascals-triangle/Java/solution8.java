class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;
        triangle.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j <= i / 2; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                newRow.add(sum);
            }
            int size = newRow.size();
            for (int j = size - 2 + (i % 2); j >= 0; j--) {
                newRow.add(newRow.get(j));
            }
            triangle.add(newRow);
        }
        return triangle;
    }
}
