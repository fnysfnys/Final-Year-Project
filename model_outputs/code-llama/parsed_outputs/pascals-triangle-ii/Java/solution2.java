class Solution {
    public List<Integer> getRow(int rowIndex) {
       int[] triangle = new int[rowIndex + 1];
       triangle[0] = 1;
       triangle[rowIndex] = 1;
       for (int i = 1; i < rowIndex; i++) {
           triangle[i] = triangle[i - 1] + triangle[i];
       }
       List<Integer> row = new ArrayList<>();
       for (int i = 0; i <= rowIndex; i++) {
           row.add(triangle[i]);
       }
       return row;
    }
    
}
