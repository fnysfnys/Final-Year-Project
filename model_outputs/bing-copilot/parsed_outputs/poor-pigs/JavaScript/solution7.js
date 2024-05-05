var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    for (let pigs = 0; ; pigs++) {
        if (Math.pow(minutesToTest / minutesToDie + 1, pigs) >= buckets) {
            return pigs;
        }
    }
};
