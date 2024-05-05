function canIWin(maxChoosableInteger, desiredTotal) {
   // Check if the desired total is achievable
   if (desiredTotal > maxChoosableInteger * (maxChoosableInteger + 1) / 2) {
       return false;
   }

   // Check if the first player can win
   for (let i = 1; i <= maxChoosableInteger; i++) {
       if (i + desiredTotal <= maxChoosableInteger * (maxChoosableInteger + 1) / 2) {
           return true;
       }
   }

   return false;
}
