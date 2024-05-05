var maxRotateFunction = function(nums) {
    const n = nums.length;
    let maxSum = -Infinity;

    for (let k = 0; k < n; k++) {
        let sum = 0;
        for (let i = 0; i < n; i++) {
            sum += i * nums[(i + k) % n];
        }
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
};