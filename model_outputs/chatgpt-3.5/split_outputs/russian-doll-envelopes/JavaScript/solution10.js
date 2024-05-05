/**
 * Using a Stack
 * @param {number[][]} envelopes
 * @return {number}
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    const stack = [];

    for (const env of envelopes) {
        let left = 0;
        let right = stack.length - 1;
        
        while (left <= right) {
            const mid = Math.floor((left + right) / 2);
            if (stack[mid][1] < env[1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left === stack.length) {
            stack.push(env);
        } else {
            stack[left] = env;
        }
    }

    return stack.length;
};
