/**
 * ... [docstring as provided] ...
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    let heightSet = new Set();

    for (let [width, height] of envelopes) {
        if (!heightSet.has(height)) {
            heightSet.add(height);
        }
    }

    return heightSet.size;
};