var findSubstringInWraproundString = function(s) {
    const maxLengthArr = Array(26).fill(0);
    let maxLength = 0;
    
    for (let i = 0; i < s.length; i++) {
        if (i > 0 && (s[i - 1] === 'z' && s[i] === 'a' || s[i - 1].charCodeAt(0) + 1 === s[i].charCodeAt(0))) {
            maxLength++;
        } else {
            maxLength = 1;
        }
        const index = s.charCodeAt(i) - 'a'.charCodeAt(0);
        maxLengthArr[index] = Math.max(maxLengthArr[index], maxLength);
    }
    
    return maxLengthArr.reduce((sum, val) => sum + val, 0);
};