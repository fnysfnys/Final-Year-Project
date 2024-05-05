/**
 * Recursive function to check if the frog can cross the river.
 */
function canCross(stones, index = 0, jumpSize = 0) {
    if (index === stones.length - 1) {
        return true; // Reached the last stone
    }
    
    for (let i = index + 1; i < stones.length; i++) {
        const gap = stones[i] - stones[index];
        if (gap >= jumpSize - 1 && gap <= jumpSize + 1) {
            if (canCross(stones, i, gap)) {
                return true;
            }
        }
        if (gap > jumpSize + 1) {
            break; // Optimization: Stones are too far apart
        }
    }
    
    return false;
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true