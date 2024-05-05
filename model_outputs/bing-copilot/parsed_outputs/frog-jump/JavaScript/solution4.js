var canCross = function(stones) {
    const memo = new Map();

    const recurse = (index, jumpSize) => {
        if (index === stones.length - 1) return true;
        if (memo.has(`${index}-${jumpSize}`)) return memo.get(`${index}-${jumpSize}`);

        for (let i = index + 1; i < stones.length; i++) {
            const gap = stones[i] - stones[index];
            if (gap >= jumpSize - 1 && gap <= jumpSize + 1) {
                if (recurse(i, gap)) {
                    memo.set(`${index}-${jumpSize}`, true);
                    return true;
                }
            }
        }

        memo.set(`${index}-${jumpSize}`, false);
        return false;
    };

    return recurse(0, 0);
};
