var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    const map = new Map();
    for (let i = 1; i < nums.length; i++) {
        for (let j = 0; j < i; j++) {
            const diff = nums[i] - nums[j];
            map.set(diff, (map.get(diff) || 0) + 1);
        }
        for (const val of map.values()) {
            count += val * (val - 1) / 2;
        }
        map.clear();
    }
    return count;
};
