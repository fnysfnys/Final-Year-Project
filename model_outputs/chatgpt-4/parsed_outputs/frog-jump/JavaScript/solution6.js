var canCross = function(stones) {
    let stonePositions = new Set(stones);
    let lastStone = stones[stones.length

- 1];
    let dp = {};
    for (let stone of stones) {
        dp[stone] = new Set();
    }
    dp[0].add(0);

    for (let stone of stones) {
        for (let step of dp[stone]) {
            for (let i = -1; i <= 1; i++) {
                let nextStep = step + i;
                let nextStone = stone + nextStep;
                if (nextStep > 0 && stonePositions.has(nextStone)) {
                    dp[nextStone].add(nextStep);
                }
            }
        }
    }
    return dp[lastStone].size > 0;
};