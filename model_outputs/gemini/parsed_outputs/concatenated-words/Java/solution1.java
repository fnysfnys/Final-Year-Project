class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> dict = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (dfs(word, dict, 0)) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean dfs(String word, HashSet<String> dict, int count) {
        if (dict.contains(word) && count > 1) {
            return true;
        }
        for (int i = 1; i < word.length(); i++) {
            String left = word.substring(0, i);
            String right = word.substring(i);
            if (dict.contains(left) && (dict.contains(right) || dfs(right, dict, count + 1))) {
                return true;
            }
        }
        return false;
    }
    
}
