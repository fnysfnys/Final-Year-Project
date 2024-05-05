var countDigitOne = function(n) {
    if (n <= 0) return 0;
    const str = n.toString();
    const len = str.length;
    const dp = new Array(len).fill(0);
    dp[0] = 1;

    for (let i = 1; i < len; i++) {
        dp[i] = dp[i - 1] * 10 + 10 ** i;
    }

    let count = 0;
    let carry = 0;

    for (let i = len - 1; i >= 0; i--) {
        const digit = parseInt(str[i]);
        const leftPart = parseInt(str.substring(0, i)) || 0;
        const rightPart = parseInt(str.substring(i + 1)) || 0;

        if (digit === 0) {
            count += leftPart * dp[i];
        } else if (digit === 1) {
            count += leftPart * dp[i] + rightPart + 1 + carry;
        } else {
            count += (leftPart + 1) * dp[i] + carry;
        }

        carry += digit * (10 ** (len - i - 1));
    }

    return count;
};