var lengthOfLIS = function(nums) {
    function dfs(index, prev) {
        if (index === nums.length) return 0;

        let include = 0;
        if (prev === -1 || nums[index] > nums[prev]) {
            include = 1 + dfs(index + 1, index);
        }
        let exclude = dfs(index + 1, prev);

        return Math.max(include, exclude);
    }

    return dfs(0, -1);
};
