var findSubstringInWraproundString = function(s) {
    let count = 0;
    const base = 'abcdefghijklmnopqrstuvwxyz';



    for (let i = 0; i < s.length; i++) {
        for (let j = i; j < s.length; j++) {
            if (base.indexOf(s.substring(i, j + 1)) !== -1) {
                count++;
            }
        }
    }

    return count;
};