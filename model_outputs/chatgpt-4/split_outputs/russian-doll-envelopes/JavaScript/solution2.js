/**
 * ... [docstring as provided] ...
 */
var maxEnvelopes = function(envelopes) {
    envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
    let tails = [];
    
    for (let envelope of envelopes) {
        let i = 0, j = tails.length;
        while (i < j) {
            let m = (i + j) >> 1;
            if (tails[m][1] < envelope[1]) i = m + 1;
            else j = m;
        }
        tails[i] = envelope;
        if (i === tails.length) tails.push(envelope);
    }
    
    return tails.length;
};
