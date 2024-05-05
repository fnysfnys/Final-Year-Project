var poorPigs = function(buckets, minutesToDie, minutesToTest, pigs = 0) {
    if (Math.pow(minutesToTest / minutesToDie + 1, pigs) >= buckets) {
        return pigs;
    }
    return poorPigs(buckets, minutesToDie, minutesToTest, pigs + 1);
};
