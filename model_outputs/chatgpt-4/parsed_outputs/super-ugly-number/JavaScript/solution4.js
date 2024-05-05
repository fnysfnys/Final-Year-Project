var nthSuperUglyNumber = function(n, primes) {
    let dp = [1];
    let pointers = primes.map(() => 0);

    for (let i = 1; i < n; i++) {
        let min = Math.min(...primes.map((p, j) => p * dp[pointers[j]]));
        dp[i] = min;

        primes.forEach((p, j) => {
            if (min === p * dp[pointers[j]]) pointers[j]++;
        });
    }

    return dp[n - 1];
};