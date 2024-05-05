public int nthUglyNumber(int n) {
    if (n == 1) return 1;
    return Math.min(nthUglyNumber(n - 1) * 2, Math.min(nthUglyNumber(n - 1) * 3, nthUglyNumber(n - 1) * 5));
}
