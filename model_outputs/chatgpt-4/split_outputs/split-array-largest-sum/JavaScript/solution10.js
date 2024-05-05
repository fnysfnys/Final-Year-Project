var splitArray = function(nums, k) {
    let result = Infinity;

    function dfs(index, k, currentMax, currentSum) {
        if (k == 1) {
            result = Math.min(result, Math.max(currentMax, nums.slice(index).reduce((a, b) => a + b, 0)));
            return;
        }
        let sum = 0;
        for (let i = index; i <= nums.length - k; i++) {
            sum += nums[i];
            dfs(i + 1, k - 1, Math.max(currentMax, sum), currentSum - sum);
        }
    }

    dfs(0, k, 0, nums.reduce((a, b) => a + b, 0));
    return result;
};
