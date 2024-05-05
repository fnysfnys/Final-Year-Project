public int numDistinct(String s, String t) {
    int m = s.length();
    int n = t.length();
    if (m < n) {
        return 0;
    }
    if (n == 0) {
        return 1;
    }

    int count = 0;
    if (s.charAt(m - 1) == t.charAt(n - 1)) {
        count += numDistinct(s.substring(0, m - 1), t.substring(0, n - 1));
    }
    count += numDistinct(s.substring(0, m - 1), t);

    return count;
}
