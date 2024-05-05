var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const dp = new Map();
    let maxSet = new Set();

    for (const num of nums) {
        let maxSubset = new Set();
        for (const key of dp.keys()) {
            if (num % key === 0 && dp.get(key).size > maxSubset.size) {
                maxSubset = new Set(dp.get(key));
            }
        }
        maxSubset.add(num);
        dp.set(num, maxSubset);
        if (maxSubset.size > maxSet.size) maxSet = maxSubset;
    }

    return Array.from(maxSet);
};
