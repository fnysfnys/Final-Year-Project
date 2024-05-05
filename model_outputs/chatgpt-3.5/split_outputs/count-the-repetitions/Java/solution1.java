public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
    int count = 0;
    int index = 0;
    while (count < n1) {
        for (char c : s1.toCharArray()) {
            if (c == s2.charAt(index)) {
                index++;
                if (index == s2.length()) {
                    index = 0;
                    count++;
                }
            }
        }
        count++;
    }
    return count / n2;
}
