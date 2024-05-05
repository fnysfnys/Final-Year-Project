/**
 * Using a Queue
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    const queue = [];

    for (const env of envelopes) {
        let left = 0,
            right = queue.length - 1;
        
        while (left <= right) {
            const mid = Math.floor((left + right) / 2);
            if (queue[mid][1] < env[1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left === queue.length) {
            queue.push(env);
        } else {
            queue[left] = env;
        }
    }

    return queue.length;
};
