var combinationSum4 = function(nums, target) {
    const backtrack = (remaining) => {
        if (remaining === 0) return 1;
        if (remaining < 0) return 0;

        let count = 0;
        for (const num of nums) {
            count += backtrack(remaining - num);
        }

        return count;
    };

    return backtrack(target);
};
