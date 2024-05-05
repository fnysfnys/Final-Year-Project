var countDigitOne = function(n) {
    const dp = new Array(10).fill(0);
    let num = n + 1;
    let count = 0;

    for (let i = 1; i < 10; i++) {
        dp[i] = dp[i - 1] * 10 + num;
        num = Math.floor(num / 10);
    }

    num = n + 1;
    for (let i = 8; i >= 0; i--) {
        const q = Math.floor(num / (10 ** i));
        num = num % (10 ** i);
        count += q * dp[i] + (q >= 2 ? 10 ** i : 0);
    }

    return count;
};