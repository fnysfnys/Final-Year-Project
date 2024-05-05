public int countNumbersWithUniqueDigits(int n) {
   int count = 0;
   Tree<Integer> uniqueDigits = new Tree<>();
   for (int i = 0; i < 10; i++) {
       if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 8 && i != 9) {
           uniqueDigits.add(i);
       }
   }
   for (int i = 0; i < 10; i++) {
       if (uniqueDigits.contains(i)) {
           count += countNumbersWithUniqueDigits(n - 1);
       }
   }
   return count;
}
