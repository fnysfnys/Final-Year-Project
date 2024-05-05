class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);
        str1.setLength(n1 * s1.length());
        str2.setLength(n2 * s2.length());
        int count = 0;
        int index = 0;
        HashMap<Integer, Integer> memo = new HashMap<>();
    
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(index)) {
                index++;
                if (index == str2.length()) {
                    index = 0;
                    count++;
                }
            }
            if (i % s1.length()
    
     == s1.length() - 1) {
                if (memo.containsKey(index)) {
                    int prevIndex = memo.get(index);
                    int prevCount = memo.getOrDefault(index, 0);
                    int cycleCount = (count - prevCount) * ((n1 * s1.length()) / s1.length());
                    int remainingCount = memo.get(index) + cycleCount;
                    int remainingCycles = (n1 * s1.length()) / s1.length();
                    return remainingCycles / n2 + (remainingCount - memo.get(index)) / n2;
                } else {
                    memo.put(index, count);
                }
            }
        }
    
        return count / n2;
    }
}
