var combinationSum4 = function(nums, target) {
    const uniqueCombinations = new Set();
    const backtrack = (remaining, path) => {
        if (remaining === 0) {
            uniqueCombinations.add(path.join(','));
            return;
        }
        if (remaining < 0) return;

        for (const num of nums) {
            backtrack(remaining - num, [...path, num]);
        }
    };

    backtrack(target, []);
    return uniqueCombinations.size;
};
