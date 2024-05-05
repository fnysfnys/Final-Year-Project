var canCross = function(stones) {
    function backtrack(index, jump) {
        if (index == stones.length - 1) return true;
        for (let i = index + 1; i < stones.length; i++) {
            let gap = stones[i] - stones[index];
            if (gap < jump - 1) continue;
            if (gap > jump + 1) return false;
            if (backtrack(i, gap)) return true;
        }
        return false;
    }
    return backtrack(0, 0);
};