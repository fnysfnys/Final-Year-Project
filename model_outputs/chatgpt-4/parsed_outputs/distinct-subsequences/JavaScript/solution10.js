function numDistinct(s, t) {
    const countTable = {};
    for (let char of s) {
        countTable[char] = (countTable[char] || 0) + 1;
    }

    let totalCount = 1;
    for (let char of t) {
        if (!countTable[char]) return 0;
        totalCount *= countTable[char];
        countTable[char] -= 1;
    }
    return totalCount;
}
