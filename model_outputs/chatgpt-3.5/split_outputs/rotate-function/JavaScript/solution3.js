var maxRotateFunction = function(nums) {
    const n = nums.length;
    let sum = 0;
    let maxSum = 0;
    let numsSum = 0;

    for (let i = 0; i < n; i++) {
        sum += i * nums[i];
        numsSum += nums[i];
    }

    maxSum = sum;

    for (let k = 1; k < n; k++) {
        sum = sum + numsSum - n * nums[n - k];
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
};
