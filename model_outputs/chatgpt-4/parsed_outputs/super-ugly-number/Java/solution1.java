class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglyNumbers = new int[n];
        int[] indices = new int[primes.length];
    
        uglyNumbers[0] = 1;
        for (int i = 1; i < n; i++) {
            uglyNumbers[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                uglyNumbers[i] = Math.min(uglyNumbers[i], primes[j] * uglyNumbers[indices[j]]);
            }
            for (int j = 0; j < primes.length; j++) {
                if (uglyNumbers[i] == primes[j] * uglyNumbers[indices[j]]) {
                    indices[j]++;
                }
            }
        }
        return uglyNumbers[n - 1];
    }
}
