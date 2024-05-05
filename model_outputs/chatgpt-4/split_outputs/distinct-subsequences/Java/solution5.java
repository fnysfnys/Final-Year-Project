public int numDistinct(String s, String t) {
    if (t.length() == 0) return 1;
    if (s.length() == 0) return 0;
    
    int count = 0;
    for (int i = 0; i <= s.length() - t.length(); i++) {
        if (s.charAt(i) == t.charAt(0)) {
            count += numDistinct(s.substring(i + 1), t.substring(1));
        }
    }
    return count;
}
