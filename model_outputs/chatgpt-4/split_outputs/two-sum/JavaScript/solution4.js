function twoSum(nums, target) {
    const numIndices = {};
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (complement in numIndices) {
            return [numIndices[complement], i];
        }
        numIndices[nums[i]] = i;
    }
}
