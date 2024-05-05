function numDistinct6(s, t) {
    let queue = [[0, 0]];
    let count = 0;

    while (queue.length > 0) {
        const [i, j] = queue.shift();
        if (j == t.length) {
            count++;
            continue;
        }
        if (i == s.length) continue;

        if (s[i] == t[j]) {
            queue.push([i + 1, j + 1]);
        }
        queue.push([i + 1, j]);
    }
    return count;
}
