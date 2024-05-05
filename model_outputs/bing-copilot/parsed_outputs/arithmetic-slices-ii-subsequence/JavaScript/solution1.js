var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    let ans = 0;
    let diff = Number.MAX_VALUE;

    for (let i = 1; i < nums.length; i++) {
        const newDiff = nums[i] - nums[i - 1];
        if (newDiff === diff) {
            ans += count++;
        } else {
            diff = newDiff;
            count = 1;
        }
    }

    return ans;
};
