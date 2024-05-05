class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] triangle = new int[numRows][numRows];
        triangle[0][0] = 1;
    
        for (int i = 1; i < numRows; i++) {
            triangle[i][0] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            triangle[i][i] = 1;
        }
    
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(triangle[i][j]);
            }
            result.add(row);
        }
    
        return result;
    }
    
}
