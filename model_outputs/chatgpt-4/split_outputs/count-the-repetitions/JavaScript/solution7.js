var getMaxRepetitions = function(s1, n1, s2, n2) {
    let str1 = s1.repeat(n1);
    let str2 = s2.repeat(n2);
    let count = 

0;

    for (let i = 0; i < str1.length - str2.length + 1; i++) {
        if (str1.substring(i, i + str2.length) === str2) {
            count++;
            i += str2.length - 1;
        }
    }

    return count;
};
