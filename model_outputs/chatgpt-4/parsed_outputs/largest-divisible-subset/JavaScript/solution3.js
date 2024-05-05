var largestDivisibleSubset = function(nums) {
    const result = [];
    const subset = [];
    nums.sort((a, b) => a - b);

    function backtrack(start) {
        if (subset.length > result.length) {
            result.length = 0;
            result.push(...subset);
        }

        for (let i = start; i < nums.length; i++) {
            if (subset.length === 0 || nums[i] % subset[subset.length - 1] === 0) {
                subset.push(nums[i]);
                backtrack(i + 1);
                subset.pop();
            }
        }
    }

    backtrack(0);
    return result;
};