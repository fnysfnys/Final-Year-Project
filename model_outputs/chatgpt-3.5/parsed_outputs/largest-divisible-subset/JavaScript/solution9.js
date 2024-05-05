var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const n = nums.length;
    const dp = new Map();

    function dfs(index) {
        if (dp.has(index)) return dp.get(index);

        let maxSubset = [];
        const currentNum = nums[index];

        for (let i = index + 1; i < n; i++) {
            if (currentNum % nums[i] === 0) {
                const subset = dfs(i);
                if (subset.length > maxSubset.length) {
                    maxSubset = subset;
                }
            }
        }

        maxSubset = [currentNum, ...maxSubset];
        dp.set(index, maxSubset);
        return maxSubset;
    }

    let maxSubset = [];
    for (let i = 0; i < n; i++) {
        const subset = dfs(i);
        if (subset.length > maxSubset.length) {
            maxSubset = subset;
        }
    }

    return maxSubset;
};