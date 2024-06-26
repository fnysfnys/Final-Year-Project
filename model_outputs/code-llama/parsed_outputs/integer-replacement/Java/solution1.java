class Solution {
    public int integerReplacement(int n) {
       int count = 0;
       while (n != 1) {
           if (n % 2 == 0) {
               n /= 2;
           } else {
               n = n % 2 == 0 ? n / 2 : n + 1;
           }
           count++;
       }
       return count;
    }
    
}
