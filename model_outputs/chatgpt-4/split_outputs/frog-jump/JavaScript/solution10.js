var canCross = function(stones) {
    let dp = new Array(stones.length).fill(0).map(() => new Set());
    dp[0].add(0);
    for (let i = 1; i < stones.length; i++) {
        for (let j = 0; j < i; j++) {
            let diff = stones[i] - stones[j];
            if (dp[j].has(diff) || dp[j].has(diff - 1) || dp[j].has(diff + 1)) {
                dp[i].add(diff);
            }
        }
    }
    return dp[stones.length - 1].size > 0;
};
