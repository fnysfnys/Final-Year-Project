class Solution {
    public List<Integer> getRow(int rowIndex) {
      Integer[] prevRow = new Integer[rowIndex + 1];
      prevRow[0] = 1;
      for (int i = 1; i <= rowIndex; i++) {
        Integer[] currRow = new Integer[rowIndex + 1];
        currRow[0] = 1;
        for (int j = 1; j < i; j++) {
          currRow[j] = prevRow[j - 1] + prevRow[j];
        }
        currRow[i] = 1;
        prevRow = currRow;
      }
      return Arrays.asList(prevRow);
    }
    
}
