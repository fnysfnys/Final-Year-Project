/**
 * Binary Search Approach
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    const dp = [];

    for (const env of envelopes) {
        const idx = binarySearch(dp, env[1]);
        if (idx === dp.length) {
            dp.push(env[1]);
        } else {
            dp[idx] = env[1];
        }
    }

    return dp.length;
};

function binarySearch(arr, target) {
    let left = 0;
    let right = arr.length;

    while (left < right) {
        const mid = Math.floor((left + right) / 2);
        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    return left;
}
