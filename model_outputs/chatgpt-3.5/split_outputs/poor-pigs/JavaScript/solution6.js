var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    let low = 0;
    let high = buckets;
    let pigs = 0;
    while (low < high) {
        const mid = Math.floor((low + high) / 2);
        const tests = Math.floor(minutesToTest / minutesToDie) + 1;
        const totalTests = Math.pow(tests, mid);
        if (totalTests >= buckets) {
            high = mid;
        } else {
            low = mid + 1;
        }
        pigs++;
    }
    return pigs;
};
