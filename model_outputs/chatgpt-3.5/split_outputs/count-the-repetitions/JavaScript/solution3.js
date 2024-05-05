var getMaxRepetitions = function(s1, n1, s2, n2) {
    let i = 0, j = 0, count1 = 0, count2 = 0;
    for (let k = 0; k < n1; k++) {
        while (i < s1.length) {
            if (s1[i] === s2[j]) {
                j++;
                if (j === s2.length) {
                    j = 0;
                    count2++;
                }
            }
            i++;
        }
        i = 0;
        count1++;
    }
    return Math.floor(count2 / n2);
};
