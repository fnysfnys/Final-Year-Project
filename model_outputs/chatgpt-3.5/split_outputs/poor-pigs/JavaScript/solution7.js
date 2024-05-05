var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    const tests = Math.floor(minutesToTest / minutesToDie) + 1;
    return Math.ceil(Math.log(buckets) / Math.log(tests));
};
