var getMaxRepetitions = function(s1, n1, s2, n2) {
    let i = 0, j = 0, count = 0;

    while (i < s1.length * n1) {
        if (s1[i % s1.length] === s2[j % s2.length]) {
            j++;
            if (j % s2.length === 0) {
                count++;
                j = 0;
            }
        }
        i++;
    }

    return Math.floor(count / n2);
};