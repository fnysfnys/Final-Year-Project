var nthSuperUglyNumber = function(n, primes) {
    let dp = new Array(n);
    let indices = new Array(primes.length).fill(0);
    dp[0] = 1;

    for (let i = 1; i < n; i++) {
        dp[i] = Math.min(...indices.map((index, idx) => primes[idx] * dp[index]));

        indices.forEach((index, idx) => {
            if (primes[idx] * dp[index] === dp[i]) {
                indices[idx]++;
            }
        });
    }

    return dp[n - 1];
};