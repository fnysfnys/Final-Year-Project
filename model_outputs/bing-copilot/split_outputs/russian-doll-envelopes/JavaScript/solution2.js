    var maxEnvelopes = function(envelopes) {
        envelopes.sort((a, b) => a[0] - b[0] || b[1] - a[1]);
        const tails = [];
        for (const [width, height] of envelopes) {
            const idx = binarySearch(tails, height);
            if (idx === tails.length) {
                tails.push(height);
            } else {
                tails[idx] = height;
            }
        }
        return tails.length;
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
    