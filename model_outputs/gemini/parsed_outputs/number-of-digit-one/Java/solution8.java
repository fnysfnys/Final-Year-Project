class Solution {
    public int countDigitOne(int n) {
      int count = 0;
      for (int i = 1; i <= n; i++) {
        count += String.valueOf(i).matches(".*1.*") ? 1 : 0;
      }
      return count;
    }
    
}
