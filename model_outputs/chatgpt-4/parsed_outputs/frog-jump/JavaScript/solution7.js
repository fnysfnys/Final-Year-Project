var canCross = function(stones) {
    let stoneMap = new Map();
    for (let i = 0; i < stones.length; i++) {
        stoneMap.set(stones[i], new Set());
    }
    stoneMap.get(0).add(0);
    for (let stone of stones) {
        for (let step of stoneMap.get(stone)) {
            for (let i = step - 1; i <= step + 1; i++) {
                if (i > 0 && stoneMap.has(stone + i)) {
                    stoneMap.get(stone + i).add(i);
                }
            }
        }
    }
    return stoneMap.get(stones[stones.length - 1]).size > 0;
};