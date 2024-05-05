class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       int count = 0;
       int[] uniqueDigits = new int[10];
       for (int i = 0; i < 10; i++) {
           if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9) {
               uniqueDigits[i] = 1;
           }
       }
       for (int i = 0; i < 10; i++) {
           if (uniqueDigits[i] == 1) {
               count += countNumbersWithUniqueDigits(n - 1);
           }
       }
       return count;
    }
    
}
