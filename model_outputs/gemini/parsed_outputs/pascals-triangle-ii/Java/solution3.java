class Solution {
    public List<Integer> getRow(int rowIndex) {
      Integer[] currRow = new Integer[rowIndex + 1];
      currRow[0] = 1;
      for (int i = 1; i <= rowIndex; i++) {
        for (int j = i; j > 0; j--) {
          if (j == i) {
            currRow[j] = 1;
          } else {
            currRow[j] = currRow[j - 1] + currRow[j];
          }
        }
      }
      return Arrays.asList(currRow);
    }
    
}
