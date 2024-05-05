/**
 * ... [docstring as provided] ...
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0]);
    let count = 0;
    let current = [0, 0];

    for (let envelope of envelopes) {
        if (envelope[0] > current[0] && envelope[1] > current[1]) {
            current = envelope;
            count++;
        }
    }

    return count;
};