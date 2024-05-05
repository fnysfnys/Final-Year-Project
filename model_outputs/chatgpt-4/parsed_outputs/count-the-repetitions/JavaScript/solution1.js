var getMaxRepetitions = function(s1, n1, s2, n2) {
    let str1 = s1.repeat(n1);
    let str2 = s2.repeat(n2);
    let count = 0;

    while (str1.includes(str2)) {
        str1 = str1.replace(str2, '');
        count++;
    }

    return count;
};