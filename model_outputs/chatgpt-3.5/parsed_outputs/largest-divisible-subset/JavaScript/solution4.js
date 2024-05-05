var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);

    function dfs(start, current) {
        let maxSubset = current.slice();

        for (let i = start; i < nums.length; i++) {
            if (current.length === 0 || nums[i] % current[current.length - 1] === 0) {
                current.push(nums[i]);
                const subset = dfs(i + 1, current);
                if (subset.length > maxSubset.length) {
                    maxSubset = subset;
                }
                current.pop();
            }
        }

        return maxSubset;
    }

    return dfs(0, []);
};