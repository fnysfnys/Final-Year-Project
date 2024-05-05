class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        
        for (
    
    String word : words) {
            wordSet.remove(word);
            if (isConcatenatedWord(word, wordSet)) {
                result.add(word);
            }
            wordSet.add(word);
        }
        
        return result;
    }
    
    private boolean isConcatenatedWord(String word, Set<String> wordSet) {
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || isConcatenatedWord(suffix, wordSet))) {
                return true;
            }
        }
        
        return false;
    }
}
