public int nthUglyNumber(int n) {
   if (n == 1) {
       return 1;
   }
   return nextUglyNumber(nthUglyNumber(n - 1));
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
