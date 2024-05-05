/**
 * Recursion and Memoization
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || a[1] - b[1]);
    const memo = {};

    function dp(index) {
        if (memo[index]) {
            return memo[index];
        }

        let maxCount = 1;
        const [w1, h1] = envelopes[index];

        for (let i = index + 1; i < envelopes.length; i++) {
            const [w2, h2] = envelopes[i];
            if (w2 > w1 && h2 > h1) {
                maxCount = Math.max(maxCount, 1 + dp(i));
            }
        }

        memo[index] = maxCount;
        return maxCount;
    }

    let maxCount = 0;
    for (let i = 0; i < envelopes.length; i++) {
        maxCount = Math.max(maxCount, dp(i));
    }

    return maxCount;
};
