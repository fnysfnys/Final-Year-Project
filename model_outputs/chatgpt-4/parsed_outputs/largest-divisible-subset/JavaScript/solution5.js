var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const memo = {};

    function dfs(index, prev) {
        if (index === nums.length) return [];
        const key = `${index}-${prev}`;
        if (memo[key]) return memo[key];

        let include = [], exclude = dfs(index + 1, prev);
        if (prev === -1 || nums[index] % prev === 0) {
            include = [nums[index], ...dfs(index + 1, nums[index])];
        }

        memo[key] = include.length > exclude.length ? include : exclude;
        return memo[key];
    }

    return dfs(0, -1);
};