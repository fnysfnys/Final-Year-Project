var getMaxRepetitions = function(s1, n1, s2, n2) {
    const regex = new RegExp(`${s2}+`, 'g');
    const matches = s1.repeat(n1).match(regex);
    return matches ? Math.floor(matches.length / n2) : 0;
};
