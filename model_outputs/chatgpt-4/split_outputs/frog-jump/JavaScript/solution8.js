var canCross = function(stones) {
    let stoneSet = new Set(stones);
    let stack = [[0, 0]];
    while (stack.length) {
        let [stone, jump] = stack.pop();
        for (let i = jump - 1; i <= jump + 1; i++) {
            if (i > 0 && stoneSet.has(stone + i)) {
                if (stone + i === stones[stones.length - 1]) {
                    return true;
                }
                stack.push([stone + i, i]);
            }
        }
    }
    return false;
};
