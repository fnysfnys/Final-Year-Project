/**
 * Queue-based BFS approach to check if the frog can cross the river.
 */
function canCross(stones) {
    const stoneSet = new Set(stones);
    const visited = new Set();
    const queue = [];
    
    queue.push([0, 0]);
    while (queue.length > 0) {
        const [position, jumpSize] = queue.shift();
        if (position === stones[stones.length - 1]) {
            return true;
        }
        if (position < 0 || !stoneSet.has(position)) {
            continue;
        }
        for (let i = jumpSize - 1; i <= jumpSize + 1; i++) {
            if (i > 0 && !visited.has(position + i)) {
                queue.push([position + i, i]);
                visited.add(position + i);
            }
        }
    }
    
    return false;
}

const stones1 = [0, 1, 3, 5, 6, 8, 12, 17];
console.log(canCross(stones1)); // Output: true