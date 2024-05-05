function numDistinct(s, t) {
    if (t.length == 0) return 1;
    if (s.length == 0) return 0;

    let count = numDistinct(s.slice(1), t);
    if (s[0] == t[0]) {
        count += numDistinct(s.slice(1), t.slice

(1));
    }
    return count;
}
