/**
 * Using Set and Sorting
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || a[1] - b[1]);
    const dp = new Set();

    for (const env of envelopes) {
        if (dp.size === 0 || env[1] > [...dp][dp.size - 1]) {
            dp.add(env[1]);
        } else {
            dp.delete([...dp][dp.size - 1]);
            dp.add(env[1]);
        }
    }

    return dp.size;
};
