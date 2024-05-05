public int nthUglyNumber(int n) {
   int uglyNumber = 1;
   for (int i = 1; i < n; i++) {
       uglyNumber = nextUglyNumber(uglyNumber);
   }
   return uglyNumber;
}

private int nextUglyNumber(int uglyNumber) {
   int nextUglyNumber = uglyNumber * 2;
   if (nextUglyNumber % 3 == 0) {
       nextUglyNumber = nextUglyNumber / 3;
   }
   if (nextUglyNumber % 5 == 0) {
       nextUglyNumber = nextUglyNumber / 5;
   }
   return nextUglyNumber;
}
