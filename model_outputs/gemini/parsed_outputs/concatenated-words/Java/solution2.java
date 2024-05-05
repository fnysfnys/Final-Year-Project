class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> dict = new HashSet<>(Arrays.asList(words));
        HashMap<String, Boolean> memo = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (dp(word, dict, memo)) {
                result.add(word);
            }
        }
        return result;
    }
    
    private boolean dp(String word, HashSet<String> dict, HashMap<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }
        for (int i = 1; i < word.length(); i++) {
            String left = word.substring(0, i);
            String right = word.substring(i);
            if (dict.contains(left) && (dict.contains(right) || dp(right, dict, memo))) {
                memo.put(word, true);
                return true;
            }
        }
        memo.put(word, false);
        return false;
    }
    
}
