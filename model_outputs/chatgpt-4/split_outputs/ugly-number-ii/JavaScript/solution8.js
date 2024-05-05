/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return the nth ugly number.
 */
var nthUglyNumber = function(n) {
    let dp = Array(n).fill(0);
    dp[0] = 1;
    let p2 = 0, p3 = 0, p5 = 0;

    for (let i = 1; i < n; i++) {
        let next2 = dp

[p2] * 2, next3 = dp[p3] * 3, next5 = dp[p5] * 5;
        dp[i] = Math.min(next2, next3, next5);
        if (dp[i] === next2) p2++;
        if (dp[i] === next3) p3++;
        if (dp[i] === next5) p5++;
    }

    return dp[n - 1];
};
