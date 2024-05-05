public int nthUglyNumber(int n) {
    int[] ugly = new int[n];
    ugly[0] = 1;
    int[] factors = {2, 3, 5};
    int[] indexes = {0, 0, 0};

    for (int i = 1; i < n; i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < factors.length; j++) {
            min = Math.min(min, ugly[indexes[j]] * factors[j]);
        }
        ugly[i] = min;

        for (int j = 0; j < factors.length; j++) {
            if (min == ugly[indexes[j]] * factors[j]) {
                indexes[j]++;
            }
        }
    }

    return ugly[n - 1];
}
