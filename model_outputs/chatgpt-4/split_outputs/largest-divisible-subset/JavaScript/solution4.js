var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    let result = [nums[0]];

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] % result[result.length - 1] === 0) {
            result.push(nums[i]);
        }
    }
    return result;
};
