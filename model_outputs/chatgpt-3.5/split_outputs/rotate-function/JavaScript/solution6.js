var maxRotateFunction = function(nums) {
    const n = nums.length;
    let sum = 0;
    let maxSum = 0;

    for (let i = 0; i < n; i++) {
        sum += i * nums[i];
        maxSum += nums[i];
    }

    let currentSum = sum;

    for (let k = 1; k < n; k++) {
        currentSum = currentSum + maxSum - n * nums[n - k];
        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
};
