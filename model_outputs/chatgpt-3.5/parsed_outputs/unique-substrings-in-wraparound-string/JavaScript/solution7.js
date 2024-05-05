var findSubstringInWraproundString = function(s) {
    let maxLength = 0;
    
    return s.split('').reduce((total, char, i) => {
        maxLength = i > 0 && (s[i - 1] === 'z' && char === 'a' || s[i - 1].charCodeAt(0) + 1 === char.charCodeAt(0)) ? maxLength + 1 : 1;
        return total + Math.max(maxLength, char.charCodeAt(0) - 'a'.charCodeAt(0) + 1);
    }, 0);
};