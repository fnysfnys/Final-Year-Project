var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    const hash = {};
    for (let i = 1; i < nums.length; i++) {
        for (let j = 0; j < i; j++) {
            const diff = nums[i] - nums[j];
            hash[diff] = (hash[diff] || 0) + 1;
        }
        for (const key in hash) {
            count += hash[key] * (hash[key] - 1) / 2;
        }
        for (const key in hash) {
            delete hash[key];
        }
    }
    return count;
};
