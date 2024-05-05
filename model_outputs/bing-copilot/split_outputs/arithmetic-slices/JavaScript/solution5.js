var numberOfArithmeticSlices = function(nums) {
    let count = 0;
    const set = new Set();
    for (let i = 1; i < nums.length; i++) {
        for (let j = 0; j < i; j++) {
            const diff = nums[i] - nums[j];
            set.add(diff);
        }
        count += set.size;
        set.clear();
    }
    return count;
};
