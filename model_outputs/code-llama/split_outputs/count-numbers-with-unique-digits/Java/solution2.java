public int countNumbersWithUniqueDigits(int n) {
   if (n == 0) {
       return 1;
   } else {
       int count = 0;
       for (int i = 0; i < 10; i++) {
           if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9) {
               count += countNumbersWithUniqueDigits(n - 1);
           }
       }
       return count;
   }
}
