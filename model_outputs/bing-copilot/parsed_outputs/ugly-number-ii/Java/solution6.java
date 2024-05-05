class Solution {
    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        int ugly = 1;
        int[] indices = new int[3];
    
        for (int i = 1; i < n; i++) {
            int nextUgly = Integer.MAX_VALUE;
            for (int j = 0; j < 3; j++) {
                nextUgly = Math.min(nextUgly, factors[j] * ugly);
            }
            ugly = nextUgly;
    
            for (int j = 0; j < 3; j++) {
                if (factors[j] * ugly == nextUgly) {
                    indices[j]++;
                }
            }
        }
    
        return ugly;
    }
    
}
