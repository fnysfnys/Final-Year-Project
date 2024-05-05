var poorPigs = function(buckets, minutesToDie, minutesToTest) {
    const memo = new Map();
    function findPigs(buckets, tests) {
        if (buckets === 0) return 0;
        if (tests === 0) return Infinity;
        const key = buckets + "-" + tests;
        if (memo.has(key)) return memo.get(key);
        const result = 1 + Math.min(findPigs(buckets - 1, tests - 1), findPigs(buckets, tests - 1));
        memo.set(key, result);
        return result;
    }
    return findPigs(buckets, Math.floor(minutesToTest / minutesToDie) + 1);
};
