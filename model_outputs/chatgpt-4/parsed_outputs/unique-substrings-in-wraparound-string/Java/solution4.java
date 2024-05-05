class Solution {
    public int findSubstringInWraproundString(String s) {
        Set<String> set = new HashSet<>();
        int continuous = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                continuous++;
            } else {
                continuous = 1;
            }

            for (int j = 0; j < continuous; j++) {
                set.add(s.substring(i - j, i + 1));
            }
        }

        return set.size();
    }
}