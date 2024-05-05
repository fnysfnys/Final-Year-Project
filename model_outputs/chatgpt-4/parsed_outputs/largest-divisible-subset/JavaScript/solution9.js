var largestDivisibleSubset = function(nums) {
    nums.sort((a, b) => a - b);
    const stack = [[0, []]];
    let maxSubset = [];

    while (stack.length) {
        const [index, subset] = stack.pop();
        if (index === nums.length) {
            if (subset.length > maxSubset.length) maxSubset = subset.slice();
            continue;
        }
        stack.push([index + 1, subset.slice()]);
        if (subset.length === 0 || nums[index] % subset[subset.length - 1] === 0) {
            subset.push(nums[index]);
            stack.push([index + 1, subset]);
        }
    }
    return maxSubset;
};