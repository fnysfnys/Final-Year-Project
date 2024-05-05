var canCross = function(stones) {
    const dp = new Array(stones.length).fill(false);
    dp[0] = true;

    const jumpMap = new Map();
    for (const stone of stones) {
        jumpMap.set(stone, new Set());
    }

    for (let i = 0; i < stones.length; i++) {
        for (const jump of jumpMap.get(stones[i])) {
            const nextStone = stones[i] + jump;
            if (jump > 0 && jumpMap.has(nextStone)) {
                jumpMap.get(nextStone).add(jump);
                jumpMap.get(nextStone).add(jump + 1);
                jumpMap.get(nextStone).add(jump - 1);
            }
        }
    }

    for (let i = 1; i < stones.length; i++) {
        for (const jump of jumpMap.get(stones[i])) {
            if (dp[i - 1] && stones[i] + jump === stones[stones.length - 1]) {
                dp[i] = true;
                break;
            }
        }
    }

    return dp[stones.length - 1];
};
