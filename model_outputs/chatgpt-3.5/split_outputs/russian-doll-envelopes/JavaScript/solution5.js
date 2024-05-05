/**
 * Using a Map
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || a[1] - b[1]);
    const dp = new Map();

    for (const env of envelopes) {
        let maxCount = 0;
        for (const [w, h] of dp.keys()) {
            if (env[0] > w && env[1] > h) {
                maxCount = Math.max(maxCount, dp.get(w, h));
            }
        }
        dp.set(env[0], env[1], maxCount + 1);
    }

    return Math.max(...dp.values());
};
