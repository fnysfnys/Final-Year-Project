class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int count = 0;
        int index = 0;
        while (count < n1) {
            for (char c : sb1.toString().toCharArray()) {
                if (c == sb2.charAt(index)) {
                    index++;
                    if (index == sb2.length()) {
                        index = 0;
                        count++;
                    }
                }
            }
            count++;
            sb1.append(s1);
        }
        return count / n2;
    }
}
