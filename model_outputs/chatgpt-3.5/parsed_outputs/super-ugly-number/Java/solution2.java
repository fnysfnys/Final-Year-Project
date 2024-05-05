class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int[] indices = new int[primes.length];
    
        for (int i = 1; i < n; i++) {
            int minUgly = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                minUgly = Math.min(minUgly, primes[j] * uglyNumbers[indices[j]]);
            }
            uglyNumbers[i] = minUgly;
    
            for (int j = 0; j < primes.length; j++) {
                if (minUgly == primes[j] * uglyNumbers[indices[j]]) {
                    indices[j]++;
                }
            }
        }
    
        return uglyNumbers[n - 1];
    }
}
