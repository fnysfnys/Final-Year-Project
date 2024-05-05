public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
   // Divide the integers into two groups
   int[] group1 = new int[maxChoosableInteger / 2];
   int[] group2 = new int[maxChoosableInteger / 2];
   for (int i = 0; i < group1.length; i++) {
       group1[i] = i + 1;
       group2[i] = maxChoosableInteger - i;
   }

   // Recursively call the function with the two groups
   return canIWin(group1, desiredTotal / 2) || canIWin(group2, desiredTotal / 2);
}

private boolean canIWin(int[] group, int desiredTotal) {
   // Check if the desired total is greater than or equal to the sum of all integers in the group
   if (desiredTotal >= group.length * (group.length + 1) / 2) {
       return true;
   }

   // Check if the desired total is less than the sum of all integers in the group
   for (int i = 0; i < group.length; i++) {
       if (canIWin(group, desiredTotal - group[i])) {
           return true;
       }
   }

   return false;
}
