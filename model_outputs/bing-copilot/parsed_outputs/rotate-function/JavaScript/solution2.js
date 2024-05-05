var maxRotateFunction = function(nums) {
    const n = nums.length;
    let sum = 0;
    let f0 = 0;

    for (let i = 0; i < n; i++) {
        sum += nums[i];
        f0 += i * nums[i];
    }

    let maxVal = f0;

    for (let k = 1; k < n; k++) {
        f0 = f0 + sum - n * nums[n - k];
        maxVal = Math.max(maxVal, f0);
    }

    return maxVal;
};
