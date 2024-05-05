/**
 * Set-based approach to check if the frog can cross the river.
 */
function canCross(stones) {
    const stoneSet = new Set(stones);
    const dp = new Array(stones.length).fill(false);
    dp[0] = true;
    
    for (let i = 1; i < stones.length; i++) {
        for (let j = i - 1; j >= 0; j--) {
            const jumpSize = stones[i] - stones[j];
            if (jumpSize <= j + 1) {
                dp[i] = dp[i] || (dp[j] && stoneSet.has(stones[i] + jumpSize));
            }
        }
    }
    
    return dp[stones.length - 1];
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true
