public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
   // Initialize a set to store the chosen integers
   Set<Integer> chosen = new HashSet<>();

   // Choose the largest integer that is not in the set
   for (int i = maxChoosableInteger; i >= 1; i--) {
       if (!chosen.contains(i)) {
           chosen.add(i);
           break;
       }
   }

   // Check if the chosen integer is greater than or equal to the desired total
   if (chosen.size() >= desiredTotal) {
       return true;
   }

   // Recursively call the function with the remaining integers
   for (int i = 1; i <= maxChoosableInteger; i++) {
       if (!chosen.contains(i)) {
           chosen.add(i);
           if (canIWin(maxChoosableInteger - i, desiredTotal - i)) {
               return true;
           }
           chosen.remove(i);
       }
   }

   return false;
}
