var nthSuperUglyNumber = function(n, primes) {
    let dp = new Array(n);
    dp[0] = 1;

    let pointers = new Array(primes.length).fill(0);

    for (let i = 1; i < n; i++) {
        let minVal = Number.MAX_SAFE_INTEGER;
        for (let j = 0; j < primes.length; j++) {
            minVal = Math.min(minVal, dp[pointers[j]] * primes[j]);
        }

        dp[i] = minVal;

        for (let j = 0; j < primes.length; j++) {
            if (dp[pointers[j]] * primes[j] === minVal) {
                pointers[j]++;
            }
        }
    }

    return dp[n - 1];
};
