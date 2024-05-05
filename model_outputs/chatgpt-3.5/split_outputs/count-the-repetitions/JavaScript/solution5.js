var getMaxRepetitions = function(s1, n1, s2, n2) {
    const dp = Array.from({ length: s1.length + 1 }, () => Array(s2.length).fill(0));
    let count1 = 0, count2 = 0, i = 0, j = 0;

    while (count1 < n1) {
        if (s1[i] === s2[j]) {
            j++;
            if (j === s2.length) {
                j = 0;
                count2++;
            }
        }
        i++;

        if (i === s1.length) {
            i = 0;
            count1++;
            if (count1 === n1) break;
            if (dp[i][j] !== 0) {
                const prevCount1 = dp[i][j][0];
                const prevCount2 = dp[i][j][1];
                const cycleCount1 = count1 - prevCount1;
                const cycleCount2 = count2 - prevCount2;
                const cycles = Math.floor((n1 - count1) / cycleCount1);
                count1 += cycles * cycleCount1;
                count2 += cycles * cycleCount2;
            } else {
                dp[i][j] = [count1, count2];
            }
        }
    }

    return Math.floor(count2 / n2);
};
