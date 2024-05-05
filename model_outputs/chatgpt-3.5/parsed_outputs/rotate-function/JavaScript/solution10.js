var maxRotateFunction = function(nums) {
    const n = nums.length;
    const f = nums.map((val, i) => i * val);
    return Math.max(...f.map((_, k) => f.reduce((acc, val, i) => acc + val * ((i + k) % n), 0)));
};