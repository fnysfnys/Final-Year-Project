const eraseOverlapIntervals = intervals => {
    intervals.sort((a, b) => a[1] - b[1]);
    const { count } = intervals.reduce(({ prevEnd, count }, [start, end]) => {
        if (start < prevEnd) {
            return { prevEnd, count: count + 1 };
        }
        return { prevEnd: end, count };
    }, { prevEnd: intervals[0][1], count: 0 });
    return count;
};