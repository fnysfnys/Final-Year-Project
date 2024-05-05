var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    function findPigs(buckets, tests) {
        if (buckets === 0) return 0;
        if (tests === 0) return Infinity;
        return 1 + Math.min(findPigs(buckets - 1, tests - 1), findPigs(buckets, tests - 1));
    }
    return findPigs(buckets, Math.floor(minutesToTest / minutesToDie) + 1);
};
