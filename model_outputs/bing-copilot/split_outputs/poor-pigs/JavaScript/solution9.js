var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    let pigs = 0;
    do {
        pigs++;
    } while (Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets);
    return pigs;
};
