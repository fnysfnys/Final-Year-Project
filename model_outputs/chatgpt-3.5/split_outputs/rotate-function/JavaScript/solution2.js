var maxRotateFunction = function(nums) {
    const n = nums.length;
    const sum = nums.reduce((acc, val, i) => acc + val * i, 0);
    let maxSum = sum;

    for (let k = 1; k < n; k++) {
        const prev = nums[n - k] * (n - 1);
        sum = sum - prev + sum - nums[n - k];
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
};
