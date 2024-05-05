function canIWin(maxChoosableInteger, desiredTotal) {
   // Initialize a map to store the results
   const memo = new Map();

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

   // Check if the second player can win
   for (let i = 1; i <= maxChoosableInteger; i++) {
       for (let j = 1; j <= maxChoosableInteger; j++) {
           if (i + j + desiredTotal <= maxChoosableInteger * (maxChoosableInteger + 1) / 2) {
               return true;
           }
       }
   }

   return false;
}
