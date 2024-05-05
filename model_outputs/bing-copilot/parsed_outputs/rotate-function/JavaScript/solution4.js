var maxRotateFunction = function(nums) {
    const n = nums.length;
    let queue = [...nums];
    let f0 = 0;

    for (let i = 0; i < n; i++) {
        f0 += i * nums[i];
    }

    let maxVal = f0;

    for (let k = 1; k < n; k++) {
        const removed = queue.shift();
        queue.push(removed);
        f0 = f0 + (n - 1) * (queue[0] - removed);
        maxVal = Math.max(maxVal, f0);
    }

    return maxVal;
};
