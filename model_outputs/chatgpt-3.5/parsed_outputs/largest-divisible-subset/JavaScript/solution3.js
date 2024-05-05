var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const n = nums.length;
    const memo = new Map();

    function dp(index, prev) {
        if (index === n) return [];

        const key = `${index}-${prev}`;
        if (memo.has(key)) return memo.get(key);

        const include = [];
        if (prev === null || nums[index] % prev === 0) {
            include.push(nums[index], ...dp(index + 1, nums[index]));
        }

        const exclude = dp(index + 1, prev);

        const result = include.length > exclude.length ? include : exclude;
        memo.set(key, result);
        return result;
    }

    return dp(0, null);
};