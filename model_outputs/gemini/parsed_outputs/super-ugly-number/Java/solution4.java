class Solution {
    public int nthSuperUglyNumber(int n, int[] primes, int index, int num) {
        if (n == 1) {
            return num;
        }
    
        int min = Integer.MAX_VALUE;
        for (int prime : primes) {
            min = Math.min(min, nthSuperUglyNumber(n - 1, primes, index, num * prime));
        }
    
        return min;
    }
    
    public int nthSuperUglyNumber(int n, int[] primes) {
        return nthSuperUglyNumber(n, primes, 0, 1);
    }
    
}
