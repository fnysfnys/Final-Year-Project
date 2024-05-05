var findSubstringInWraproundString = function(s) {
    const visited = new Array(26).fill(false);
    let count = 0, len = 0;

    for (let i = 0; i < s.length; i++) {
        const current = s.charCodeAt(i) - 'a'.charCodeAt(0);
        if (i > 0 && (s.charCodeAt(i) - s.charCodeAt(i - 1) === 1 || s.charCodeAt(i - 1) - s.charCodeAt(i) === 25)) {
            len++;
        } else {
            len = 1;
        }
        if (!visited[current]) {
            count += len;
            visited[current] = true;
        }
    }

    return count;
};