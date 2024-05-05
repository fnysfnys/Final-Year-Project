class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            wordSet.remove(word); // Exclude the current word from the set
            if (canFormConcatenatedWord(word, wordSet, new HashMap<>())) {
                result.add(word);
            }
            wordSet.add(word); // Restore the word to the set
        }
        
        return result;
    }
    
    private boolean canFormConcatenatedWord(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) {
            return memo.get(word);
        }
        
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || canFormConcatenatedWord(suffix, wordSet, memo))) {
                memo.put(word, true);
                return true;
            }
        }
        
        memo.put(word, false);
        return false;
    }
}
