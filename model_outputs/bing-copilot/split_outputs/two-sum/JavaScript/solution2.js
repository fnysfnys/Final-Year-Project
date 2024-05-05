var twoSum = function(nums, target) {
    const numToIndexMap = new Map();
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (numToIndexMap.has(complement)) {
            return [numToIndexMap.get(complement), i];
        }
        numToIndexMap.set(nums[i], i);
    }
    return []; // No valid solution found
};
