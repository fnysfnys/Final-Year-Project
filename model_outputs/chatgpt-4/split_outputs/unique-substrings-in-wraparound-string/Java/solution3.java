class Solution {
    public int findSubstringInWraproundString(String s) {
        HashSet<String> uniqueSubstrings = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isInWraparoundString(substring)) {
                    uniqueSubstrings.add(substring);
                }
            }
        }

        return uniqueSubstrings.size();
    }

    private boolean isInWraparoundString(String sub) {
        for (int i = 1; i < sub.length(); i++) {
            if ((sub.charAt(i) - sub.charAt(i - 1) != 1) && (sub.charAt(i - 1) - sub.charAt(i) != 25)) {
                return false;
            }
        }
        return true;
    }
}
