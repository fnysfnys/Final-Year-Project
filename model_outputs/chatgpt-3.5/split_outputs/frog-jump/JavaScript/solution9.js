/**
 * Loop-based approach to check if the frog can cross the river.
 */
function canCross(stones) {
    const n = stones.length;
    let index = 0;
    let jumpSize = 0;
    
    while (index < n - 1) {
        let nextJump = jumpSize + 1;
        let found = false;
        
        for (let i = index + 1; i < n; i++) {
            const gap = stones[i] - stones[index];
            if (gap >= nextJump) {
                break; // Stones are too far apart
            } else if (gap === nextJump) {
                index = i;
                jumpSize = nextJump;
                found = true;
                break;
            }
        }
        
        if (!found) {
            return false;
        }
    }
    
    return true;
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true
