var nthUglyNumber = function(n) {
    const next = new Set([1]);
    let cur = 0;
    for (let i = 0; i < n; i++) {
        cur = Math.min(...next);
        next.delete(cur);
        next.add(cur * 2);
        next.add(cur * 3);
        next.add(cur * 5);
    }
    return cur;
};
