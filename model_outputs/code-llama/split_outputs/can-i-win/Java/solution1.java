public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
   // Check if the desired total is greater than the sum of all integers
   if (desiredTotal > (maxChoosableInteger * (maxChoosableInteger + 1)) / 2) {
       return false;
   }

   // Check if the desired total is equal to the sum of all integers
   if (desiredTotal == (maxChoosableInteger * (maxChoosableInteger + 1)) / 2) {
       return true;
   }

   // Check if the desired total is less than the sum of all integers
   for (int i = 1; i <= maxChoosableInteger; i++) {
       if (canIWin(maxChoosableInteger - i, desiredTotal - i)) {
           return true;
       }
   }

   return false;
}
