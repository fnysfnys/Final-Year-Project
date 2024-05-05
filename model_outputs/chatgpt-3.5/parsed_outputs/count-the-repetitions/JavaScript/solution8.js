var getMaxRepetitions = function(s1, n1, s2, n2) {
    const dfs = (i, j, count1, count2) => {
        if (count1 === n1) return count2 / n2;
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
        }
        return dfs(i, j, count1, count2);
    };

    return Math.floor(dfs(0, 0, 0, 0));
};