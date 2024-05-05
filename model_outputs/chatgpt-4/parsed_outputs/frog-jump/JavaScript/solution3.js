var canCross = function(stones) {
    for (let i = 1; i < stones.length; ++i)
        if (stones[i] - stones[i - 1] > i) return false;

    const lastStone = stones[stones.length - 1];
    const positions = new Set(stones);
    let currentPositions = new Set([0]);
    let jumpDistance = 1;

    while (currentPositions.size > 0) {
        const nextPositions = new Set();
        for (let pos of currentPositions) {
            for (let j = jumpDistance - 1; j <= jumpDistance + 1; j++) {
                if (j > 0 && positions.has(pos + j)) {
                    if (pos + j == lastStone) return true;
                    nextPositions.add(pos + j);
                }
            }
        }
        currentPositions = nextPositions;
        jumpDistance++;
    }
    return false;
};