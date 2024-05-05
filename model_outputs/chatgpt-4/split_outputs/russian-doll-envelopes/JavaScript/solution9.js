/**
 * ... [docstring as provided] ...
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    let memo = {};

    function dp(i) {
        if (i == envelopes.length) return 0;
        if (memo[i] != undefined) return memo[i];

        let max = 1;
        for (let j = i + 1; j < envelopes.length; j++) {
            if (envelopes[j][0] > envelopes[i][0] && envelopes[j][1] > envelopes[i][1]) {
                max = Math.max(max, 1 + dp(j));
            }
        }
        memo[i] = max;
        return max;
    }

    let result = 0;
    for (let i = 0; i < envelopes.length; i++) {
        result = Math.max(result, dp(i));
    }

    return result;
};