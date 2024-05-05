class Solution {
    public int nthUglyNumber(int n) {
       int[] uglyNumbers = new int[n];
       uglyNumbers[0] = 1;
       for (int i = 1; i < n; i++) {
           uglyNumbers[i] = nextUglyNumber(uglyNumbers[i - 1]);
       }
       return uglyNumbers[n - 1];
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
    
}
