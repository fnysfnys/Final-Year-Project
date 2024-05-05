var canCross = function(stones) {
    let stoneSet = new Set(stones);
    let queue = [[0, 0]];
    while (queue.length) {
        let [stone, jump] = queue.shift();
        for (let i = jump - 1; i <= jump + 1; i++) {
            if (i > 0 && stoneSet.has(stone + i)) {
                if (stone + i === stones[stones.length - 1]) {
                    return true;
                }
                queue.push([stone + i, i]);
            }
        }
    }
    return false;
};
