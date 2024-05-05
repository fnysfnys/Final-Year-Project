public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    int s1Len = s1.length();
    int s2Len = s2.length();
    int[] repeatCount = new int[s2Len + 1];
    int[] nextIndex = new int[s2Len + 1];
    int count = 0;
    int index = 0;

    for (int i = 1; i <= n1; i++) {
        for (int j = 0; j < s1Len; j++) {
            if (s1.charAt(j) == s2.charAt(index)) {
                index++;
                if (index == s2Len) {
                    index = 0;
                    count++;
                }
            }
        }
        repeatCount[i] = count;
        nextIndex[i] = index;
        for (int start = 1; start < i; start++) {
            if (nextIndex[start] == index) {
                int patternCount = (n1 - start) / (i - start) * (repeatCount[i] - repeatCount[start]);
                int suffixCount = repeatCount[start + (n1 - start) % (i - start)] - repeatCount[start];
                return (patternCount + suffixCount) / n2;
            }
        }
    }

    return repeatCount[n1] / n2;
}
