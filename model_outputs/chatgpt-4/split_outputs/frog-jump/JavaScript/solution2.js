var canCross = function(stones) {
    const dp = new Array(stones.length).fill(0).map(() => new Set());
    dp[0].add(0);
    for (let i = 1; i < stones.length; i++) {
        for (let j = 0; j < i; j++) {
            let gap = stones[i] - stones[j];
            if (dp[j].has(gap - 1) || dp[j].has(gap) || dp[j].has(gap + 1)) {
                dp[i].add(gap);
            }
        }
    }
    return dp[stones.length - 1].size > 0;
};
