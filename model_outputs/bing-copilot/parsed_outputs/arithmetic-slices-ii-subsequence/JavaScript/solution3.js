var numberOfArithmeticSlices = function(nums) {
    const memo = new Map();

    function dfs(start, diff) {
        if (start >= nums.length) return 0;
        const key = `${start}-${diff}`;
        if (memo.has(key)) return memo.get(key);

        let count = 0;
        for (let i = start + 1; i < nums.length; i++) {
            if (nums[i] - nums[start] === diff) {
                count += 1 + dfs(i, diff);
            }
        }

        memo.set(key, count);
        return count;
    }

    let ans = 0;
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            ans += dfs(j, nums[j] - nums[i]);
        }
    }

    return ans;
};
