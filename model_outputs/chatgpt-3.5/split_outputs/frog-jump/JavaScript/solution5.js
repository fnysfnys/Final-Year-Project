/**
 * Bottom-up dynamic programming approach to check if the frog can cross the river.
 */
function canCross(stones) {
    const n = stones.length;
    const dp = new Array(n).fill(false).map(() => new Set());
    dp[0].add(0);
    
    for (let i = 0; i < n; i++) {
        for (const jumpSize of dp[i]) {
            for (let k = -1; k <= 1; k++) {
                const nextJumpSize = jumpSize + k;
                if (nextJumpSize > 0 && stones.includes(stones[i] + nextJumpSize)) {
                    const nextIndex = stones.indexOf(stones[i] + nextJumpSize);
                    dp[nextIndex].add(nextJumpSize);
                }
            }
        }
    }
    
    return dp[n - 1].size > 0;
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true
