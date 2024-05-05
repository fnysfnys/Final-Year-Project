var canCross = function(stones) {
    const jumpMap = new Map();
    for (const stone of stones) {
        jumpMap.set(stone, new Set());
    }
    jumpMap.get(0).add(0);

    for (let i = 0; i < stones.length; i++) {
        for (const jump of jumpMap.get(stones[i])) {
            for (const nextJump of [jump - 1, jump, jump + 1]) {
                if (nextJump > 0 && jumpMap.has(stones[i] + nextJump)) {
                    jumpMap.get(stones[i] + nextJump).add(nextJump);
                }
            }
        }
    }

    return jumpMap.get(stones[stones.length - 1]).size > 0;
};
