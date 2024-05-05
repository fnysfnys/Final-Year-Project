var getMaxRepetitions = function(s1, n1, s2, n2) {
    const arr1 = s1.split('');
    const arr2 = s2.split('');
    let count1 = 0, count2 = 0, i = 0, j = 0;

    while (count1 < n1) {
        if (arr1[i] === arr2[j]) {
            j++;
            if (j === arr2.length) {
                j = 0;
                count2++;
            }
        }
        i++;

        if (i === arr1.length) {
            i = 0;
            count1++;
        }
    }

    return Math.floor(count2 / n2);
};
