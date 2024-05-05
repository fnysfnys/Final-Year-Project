/**
 * ... [docstring as provided] ...
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || a[1] - b[1]);
    let dpMap = new Map();
    let max = 1;

    for (let [w, h] of envelopes) {
        let best = 1;
        for (let [prevW, prevH] of dpMap) {
            if (prevW < w && prevH < h) {
                best = Math.max(best, dpMap.get([prevW, prevH]) + 1);
            }
        }
        dpMap.set([w, h], best);
        max = Math.max(max, best);
    }

    return max;
};