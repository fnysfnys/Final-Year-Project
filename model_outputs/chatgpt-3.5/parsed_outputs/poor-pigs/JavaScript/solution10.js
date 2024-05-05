var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    let pigs = 0;
    let tests = 1;
    while (Math.pow(tests, pigs) < buckets) {
        tests++;
        pigs++;
    }
    return pigs;
};