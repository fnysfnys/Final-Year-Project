var maxRotateFunction = function(nums) {
    const n = nums.length;
    let sum = 0;
    let maxSum = 0;

    for (let i = 0; i < n; i++) {
        sum += i * nums[i];
    }

    maxSum = sum;

    for (let k = 1; k < n; k++) {
        const [last] = nums.splice(-1, 1);
        sum = sum + (n - 1) * last - nums.reduce((acc, val) => acc + val, 0);
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
};