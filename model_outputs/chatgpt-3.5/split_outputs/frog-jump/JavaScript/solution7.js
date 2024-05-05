/**
 * Stack-based DFS approach to check if the frog can cross the river.
 */
function

 canCross(stones) {
    const n = stones.length;
    const stack = [[0, 0]];
    
    while (stack.length > 0) {
        const [index, jumpSize] = stack.pop();
        if (index === n - 1) {
            return true;
        }
        
        for (let i = index + 1; i < n; i++) {
            const gap = stones[i] - stones[index];
            if (gap >= jumpSize - 1 && gap <= jumpSize + 1) {
                stack.push([i, gap]);
            } else if (gap > jumpSize + 1) {
                break;
            }
        }
    }
    
    return false;
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true
