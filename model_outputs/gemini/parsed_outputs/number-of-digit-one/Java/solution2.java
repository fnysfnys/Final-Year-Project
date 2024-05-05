class Solution {
    public int countDigitOne(int n) {
      int count = 0;
      for (int i = 1; i <= n; i++) {
        int current = i;
        while (current != 0) {
          if (current % 10 == 1) {
            count++;
          }
          current /= 10;
        }
      }
      return count;
    }
    
}
