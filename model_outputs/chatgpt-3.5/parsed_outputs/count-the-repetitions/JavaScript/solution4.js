var getMaxRepetitions = function(s1, n1, s2, n2) {
    let i = 0, j = 0, count1 = 0, count2 = 0;
    const seen = new Map();
    while (count1 < n1) {
        if (i === s1.length) {
            if (seen.has(j)) {
                const [count1Prev, count2Prev] = seen.get(j);
                const cycleCount1 = count1 - count1Prev;
                const cycleCount2 = count2 - count2Prev;
                const cycles = Math.floor((n1 - count1Prev) / cycleCount1);
                count1 += cycles * cycleCount1;
                count2 += cycles * cycleCount2;
            } else {
                seen.set(j, [count1, count2]);
            }
        }
        if (s1[i] === s2[j]) {
            j++;
            if (j === s2.length) {
                j = 0;
                count2++;
            }
        }
        i++;
        count1++;
    }
    return Math.floor(count2 / n2);
};