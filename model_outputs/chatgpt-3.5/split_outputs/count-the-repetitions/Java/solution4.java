public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    int j = 0, count = 0;

    for (int k = 1; k <= n1; k++) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
                if (j == s2.length()) {
                    j = 0;
                    count++;
                }
            }
        }
        countMap.put(k, count);
        for (int start = 1; start < k; start++) {
            if (countMap.get(start) == count) {
                int patternCount = (n1 - start) / (k - start) * (countMap.get(k) - countMap.get(start));
                int suffixCount = countMap.get(start + (n1 - start) % (k - start)) - countMap.get(start);
                return (patternCount + suffixCount) / n2;
            }
        }
    }
    return countMap.get(n1) / n2;
}
