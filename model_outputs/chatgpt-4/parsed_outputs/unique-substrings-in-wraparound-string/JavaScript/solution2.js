var findSubstringInWraproundString = function(s) {
    const dp = new Array(26).fill(0);
    let maxLengthCur = 0;

    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) === 1 || s.charCodeAt(i - 1) - s.charCodeAt(i) === 25)) {
            maxLengthCur++;
        } else {
            maxLengthCur = 1;
        }
        dp[s.charCodeAt(i) - 'a'.charCodeAt(0)] = Math.max(dp[s.charCodeAt(i) - 'a'.charCodeAt(0)], maxLengthCur);
    }

    return dp.reduce((a, b) => a + b);
};