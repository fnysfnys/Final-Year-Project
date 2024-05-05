var combinationSum4 = function(nums, target) {
    if (target === 0) return 1;
    if (target < 0) return 0;

    let count = 0;
    for (let num of nums) {
        count += combinationSum4(nums, target - num);
    }
    return count;
};