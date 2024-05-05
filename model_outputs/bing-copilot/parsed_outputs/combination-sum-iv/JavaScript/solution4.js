var combinationSum4 = function(nums, target) {
    const combinations = Array(target + 1).fill(0);
    combinations[0] = 1;

    for (let i = 1; i <= target; i++) {
        for (const num of nums) {
            if (i >= num) {
                combinations[i] += combinations[i - num];
            }
        }
    }

    return combinations[target];
};
