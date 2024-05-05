    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        String s1Concat = s1.repeat(n1);
        String s2Concat = s2.repeat(n2);
        int m = 0;
        while (s1Concat.contains(s2Concat)) {
            m++;
            s1Concat = s1Concat.replaceFirst(s2Concat, "");
        }
        return m;
    }
    