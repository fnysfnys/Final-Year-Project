class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<Integer> result = new ArrayList<>();
      for (int i = 0; i <= rowIndex; i++) {
        result.add((int) Math.factorial(rowIndex) / (int) Math.factorial(i) / (int) Math.factorial(rowIndex - i));
      }
      return result;
    }
    
}
