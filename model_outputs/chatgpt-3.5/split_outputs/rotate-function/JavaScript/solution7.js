var maxRotateFunction = function(nums) {
    const n = nums.length;
    const f = Array(n);

    for (let i = 0; i < n; i++) {
        f[i] = i * nums[i];
    }

    let sum = f.reduce((acc, val) => acc + val, 0);
    let maxSum = sum;

    for (let k = 1; k < n; k++) {
        sum = sum + f[n - k] - (n * nums[n - k]);
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
};
