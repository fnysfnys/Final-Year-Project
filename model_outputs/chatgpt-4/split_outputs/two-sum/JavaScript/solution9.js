function twoSum(nums, target) {
    const seen = new Set();
    for (let i = 0; i < nums.length; i++) {
        if (seen.has(target - nums[i])) {
            return [nums.indexOf(target - nums[i]), i];
        }
        seen.add(nums[i]);
    }
}
