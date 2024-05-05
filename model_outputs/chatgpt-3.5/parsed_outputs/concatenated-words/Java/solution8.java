class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Boolean> memo = new HashMap<>();
        
        for (String word : words) {
            wordSet.remove(word);
            if (isConcatenatedWord(word, wordSet, memo)) {
                result.add(word);
            }
            wordSet.add(word);
        }
        
        return result;
    }
    
    private boolean isConcatenatedWord(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }
        
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || isConcatenatedWord(suffix, wordSet, memo))) {
                memo.put(word, true);
                return true;
            }
        }
        
        memo.put(word, false);
        return false;
    }
}
