var getMaxRepetitions = function(s1, n1, s2, n2) {
    let str1 = '', str2 = '';
    let count1 = 0, count2 = 0;
    let i = 0, j = 0;

    while (count1 < n1) {
        str1 += s1[i];
        str2 += s2[j];
        i++;
        j++;

        if (i === s1.length) {
            i = 0;
            count1++;
        }
        if (j === s2.length) {
            j = 0;
            count2++;
        }
    }

    return Math.floor(count2 / n2);
};
