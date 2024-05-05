class Solution {
    public List<Integer> getRow(int rowIndex) {
       int[][] triangle = new int[rowIndex + 1][rowIndex + 1];
       for (int i = 0; i <= rowIndex; i++) {
           triangle[i][0] = 1;
           triangle[i][i] = 1;
           for (int j = 1; j < i; j++) {
               triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
           }
       }
       List<Integer> row = new ArrayList<>();
       for (int i = 0; i <= rowIndex; i++) {
           row.add(triangle[rowIndex][i]);
       }
       return row;
    }
    
}
