function numDistinct9(s, t, i = 0, j = 0) {
    if (j == t.length) return 1;
    if (i == s.length) return 0;

    let count = numDistinct9(s, t, i + 1, j);
    if (s[i] == t[j]) {
        count += numDistinct9(s, t, i + 1, j + 1);
    }
    return count;
}
