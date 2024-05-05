var canCross = function(stones) {
    const DELIMITER = '#';
    const cache = new Map();

    const recurse = (index, jumpSize) => {
        if (index === stones.length - 1) return true;

        const key = `${index}${DELIMITER}${jumpSize}`;
        if (cache.has(key)) return cache.get(key);

        for (let i = index + 1; i < stones.length; i++) {
            const gap = stones[i] - stones[index];
            if (gap >= jumpSize - 1 && gap <= jumpSize + 1) {
                if (recurse(i, gap)) {
                    cache.set(key, true);
                    return true;
                }
            }
        }

        cache.set(key, false);
        return false;
    };

    return recurse(0, 0);
};
