var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    const findPigs = (buckets, minutesToDie, minutesToTest, pigs) => {
        if (Math.pow(minutesToTest / minutesToDie + 1, pigs) >= buckets) {
            return pigs;
        }
        return findPigs(buckets, minutesToDie, minutesToTest, pigs + 1);
    };
    return findPigs(buckets, minutesToDie, minutesToTest, 0);
};
