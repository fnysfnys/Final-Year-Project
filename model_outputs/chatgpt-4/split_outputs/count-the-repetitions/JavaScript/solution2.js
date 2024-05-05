var getMaxRepetitions = function(s1, n1, s2, n2) {
    let str1 = s1.repeat(n1);
    let str2 = s2.repeat(n2);
    let regex = new RegExp(str2, 'g');

    return (str1.match(regex) || []).length;
};
