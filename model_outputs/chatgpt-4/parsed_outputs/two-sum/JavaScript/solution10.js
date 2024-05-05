function twoSum(nums, target

, index = 0, map = {}) {
    if (index >= nums.length) return;
    const complement = target - nums[index];
    if (complement in map) {
        return [map[complement], index];
    }
    map[nums[index]] = index;
    return twoSum(nums, target, index + 1, map);
}