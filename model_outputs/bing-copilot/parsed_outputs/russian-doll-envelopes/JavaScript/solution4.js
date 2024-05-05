    var maxEnvelopes = function(envelopes) {
        const map = new Map();
        envelopes.sort((a, b) => a[0] - b[0]);
        for (const [width, height] of envelopes) {
            let maxNested = 1;
            for (const [w, h] of map) {
                if (width > w && height > h) {
                    maxNested = Math.max(maxNested, map.get(w) + 1);
                }
            }
            map.set(width, maxNested);
        }
        return Math.max(...map.values());
    };
    