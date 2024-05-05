var splitArray = function(nums, k) {
    const memo = new Map();

    function helper(start, k) {
        if (k == 1) return nums.slice(start).reduce((a, b) => a + b, 0);
        if (memo.has(`${start},${k}`)) return memo.get(`${start},${k}`);

        let sum = 0, minMaxSum = Infinity;
        for (let i = start; i < nums.length - k + 1; i++) {
            sum += nums[i];
            minMaxSum = Math.min(minMaxSum, Math.max(sum, helper(i + 1, k - 1)));
        }

        memo.set(`${start},${k}`, minMaxSum);
        return minMaxSum;
    }

    return helper(0, k);
};
