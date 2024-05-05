/**
 * While loop with early exit and set approach to check if the frog can cross the river.
 */
function canCross(stones) {
    const n = stones.length;
    const stoneSet = new Set(stones);
    const visited = new Set();
    let index = 0;
    let jumpSize = 0;
    
    while (index < n - 1) {
        let found = false;
        
        for (let i = jumpSize + 1; i >= jumpSize - 1; i--) {
            if (i > 0 && stoneSet.has(stones[index] + i) && !visited.has(stones[index] + i)) {
                const nextIndex = stones.indexOf(stones[index] + i);
                index = nextIndex;
                jumpSize = i;
                visited.add(stones[index]);
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