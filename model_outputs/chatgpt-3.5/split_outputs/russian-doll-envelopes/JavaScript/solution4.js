/**
 * Two-Pointer Approach
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    let left = 0;
    let right = envelopes.length - 1;
    let maxCount = 0;

    while (left <= right) {
        let count = 1;
        const currEnv = envelopes[left];

        for (let i = left + 1; i <= right; i++) {
            if (envelopes[i][1] > currEnv[1]) {
                currEnv[1] = envelopes[i][1];
                count++;
            }
        }

        maxCount = Math.max(maxCount, count);
        left++;
    }

    return maxCount;
};
