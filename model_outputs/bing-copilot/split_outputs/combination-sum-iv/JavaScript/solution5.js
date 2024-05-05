var combinationSum4 = function(nums, target) {
    const factorial = (n) => (n === 0 ? 1 : n * factorial(n - 1));
    const sum = nums.reduce((acc, num) => acc + num, 0);

    return factorial(target + sum - 1) / (factorial(target) * factorial(sum - 1));
};
