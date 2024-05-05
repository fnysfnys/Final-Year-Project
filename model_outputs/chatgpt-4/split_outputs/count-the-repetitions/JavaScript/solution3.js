var getMaxRepetitions = function(s1, n1, s2, n2) {
    let count = 0;
    let index = 0;
    let str2 = s2.repeat(n2);

    for (let i = 0; i < s1.length * n1; i++) {
        if (s1[i % s1.length] === str2[index % str2.length]) {
            index++;
            if (index % str2.length === 0) count++;
        }
    }

    return count;
};
