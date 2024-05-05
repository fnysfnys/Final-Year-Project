var maxRotateFunction = function(nums) {
    const n = nums.length;
    let sum = 0;
    let maxSum = 0;
    let numsSum = 0;
    let k = 0;

    for (let i = 0; i < n; i++) {
        sum += i * nums[i];
        numsSum += nums[i];
    }

    maxSum = sum;

    while (k < n - 1) {
        sum = sum + numsSum - n * nums[n - 1 - k];
        maxSum = Math.max(maxSum, sum);
        k++;
    }

    return maxSum;
};
