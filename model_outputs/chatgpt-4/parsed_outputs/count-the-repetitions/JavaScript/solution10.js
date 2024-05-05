var getMaxRepetitions = function(s1, n1, s2, n2) {
    let str1 = '', str2 = '', count = 0;

    for (let i = 0; i < n1; i++) str1 += s1;
    for (let i = 0; i < n2; i++) str2 += s2;

    let index = 0;
    for (let char of str1) {
        if (char === str2[index % str2.length]) {
            index++;
            if (index % str2.length === 0) count++;
        }
    }

    return count;
};