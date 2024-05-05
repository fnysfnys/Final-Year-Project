class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
       // Initialize a bitmask to store the chosen integers
       int chosen = 0;
    
       // Choose the largest integer that is not in the bitmask
       for (int i = maxChoosableInteger; i >= 1; i--) {
           if ((chosen & (1 << i)) == 0) {
               chosen |= (1 << i);
               break;
           }
       }
    
       // Check if the chosen integer is greater than or equal to the desired total
       if (chosen >= desiredTotal) {
           return true;
       }
    
       // Recursively call the function with the remaining integers
       for (int i = 1; i <= maxChoosableInteger; i++) {
           if ((chosen & (1 << i)) == 0) {
               chosen |= (1 << i);
               if (canIWin(maxChoosableInteger - i, desiredTotal - i)) {
                   return true;
               }
               chosen &= ~(1 << i);
           }
       }
    
       return false;
    }
    
}
