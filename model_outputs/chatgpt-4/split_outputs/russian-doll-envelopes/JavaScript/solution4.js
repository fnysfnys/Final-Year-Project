/**
 * ... [docstring as provided] ...
 */
var maxEnvelopes = function(envelopes) {
    function helper(index, prevWidth, prevHeight) {
        if (index === envelopes.length) return 0;
        let include = 0;
        if (envelopes[index][0] > prevWidth && envelopes[index][1] > prevHeight) {
            include = 1 + helper(index + 1, envelopes[index][0], envelopes[index][1]);
        }
        let exclude = helper(index + 1, prevWidth, prevHeight);
        return Math.max(include, exclude);
    }

    envelopes.sort((a, b) => a[0] - b[0]);
    return helper(0, 0, 0);
};
