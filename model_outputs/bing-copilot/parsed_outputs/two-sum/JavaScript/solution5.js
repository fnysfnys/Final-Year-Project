var twoSum = function(nums, target) {
    const numToIndex = {};
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (complement in numToIndex) {
            return [numToIndex[complement], i];
        }
        numToIndex[nums[i]] = i;
    }
    return []; // No valid solution found
};
