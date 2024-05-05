var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    const tests = Math.floor(minutesToTest / minutesToDie) + 1;
    const dp = new Array(buckets + 1).fill(0);
    for (let pigs = 1; pigs <= buckets; pigs++) {
        dp[pigs] = 1 + dp[pigs - 1] * tests;
        if (dp[pigs] >= buckets) return pigs;
    }
};
