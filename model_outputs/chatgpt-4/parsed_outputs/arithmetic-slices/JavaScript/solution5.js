var numberOfArithmeticSlices = function(nums) {
    return nums.reduce((acc, _, i, arr) => {
        if (i > 1 && arr[i] - arr[i - 1] == arr[i - 1] - arr[i - 2]) {
            acc.count += ++acc.window;
        } else {
            acc.window = 0;
        }
        return acc;
    }, { count: 0, window: 0 }).count;
};