var canCross = function(stones) {
    const n = stones.length;
    for (let i = 1; i < n; i++) {
        if (stones[i] > stones[i - 1] + i) return false;
    }
    const lastStone = stones[n - 1];
    const stack = [[0, 0]]; // [position, jump]
    while (stack.length) {
        let [pos, jump] = stack.pop();
        for (let nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
            if (nextJump > 0) {
                let nextPos = pos + nextJump;
                if (nextPos === lastStone) return true;
                if (stones.includes(nextPos)) {
                    stack.push([nextPos, nextJump]);
                }
            }
        }
    }
    return false;
};