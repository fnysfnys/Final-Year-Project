var getMaxRepetitions = function(s1, n1, s2, n2, count = 0) {
    if (n1 === 0) return count;

    let str1 = s1.repeat(n1);
    let str2 = s2.repeat(n2);

    if (!str1.includes(str2)) return count;
    
    return getMaxRepetitions(s1, n1 - 1, s2, n2, count + 1);
};
