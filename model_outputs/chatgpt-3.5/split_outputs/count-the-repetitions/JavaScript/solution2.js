var getMaxRepetitions = function(s1, n1, s2, n2) {
    let i = 0, j = 0, count1 = 0, count2 = 0;
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
        }
    }
    return Math.floor(count2 / n2);
};
