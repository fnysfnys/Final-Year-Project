public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    char[] s1Chars = s1.toCharArray();
    char[] s2Chars = s2.toCharArray();
    int s1Len = s1Chars.length;
    int s2Len = s2Chars.length;
    int[] repeatCount = new int[s2Len];
    int[] nextIndex = new int[s2Len];
    int count = 0;
    int index = 0;

    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < s1Len; j++) {
            if (s1Chars[j] == s2Chars[index]) {
                index++;
                if (index == s2Len) {
                    index = 0;
                    count++;
                }
            }
        }
        repeatCount[i % s2Len] = count;
        nextIndex[i % s2Len] = index;
        for (int start = 0; start < i % s2Len; start++) {
            if (nextIndex[start] == index) {
                int patternCount = (n1 - start - 1) / (i % s2Len - start) * (repeatCount[i % s2Len] - repeatCount[start]);
                int suffixCount = repeatCount[start + (n1 - start - 1) % (i % s2Len - start)] - repeatCount[start];
                return (patternCount + suffixCount) / n2;
            }
        }
    }

    return repeatCount[(n1 - 1) % s2Len] / n2;
}
