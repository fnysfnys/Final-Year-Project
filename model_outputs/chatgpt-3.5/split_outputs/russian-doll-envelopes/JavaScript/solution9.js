/**
 * Using a Set and Binary Search
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || a[1] - b[1]);
    const dp = new Set();

    for (const env of envelopes) {
        let target = env[1];
        if (dp.has(target)) target++;
        while (dp.has(target)) target++;
        dp.add(target);
    }

    return dp.size;
};
