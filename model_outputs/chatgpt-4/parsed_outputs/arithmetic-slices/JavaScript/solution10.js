var numberOfArithmeticSlices = function(nums) {
    return nums
        .map((_, i, arr) => i > 1 && arr[i] - arr[i - 1] === arr[i - 1] - arr[i - 2])
        .filter(Boolean)
        .reduce((acc, _, i, self) => acc + (i + 1), 0);
};