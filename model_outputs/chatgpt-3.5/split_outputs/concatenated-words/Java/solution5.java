public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> result = new ArrayList<>();
    Set<String> wordSet = new HashSet<>(Arrays.asList(words));
    Set<String> memo = new HashSet<>();
    
    for (String word : words) {
        if (isConcatenatedWord(word, wordSet, memo)) {
            result.add(word);
        }
    }
    
    return result;
}

private boolean isConcatenatedWord(String word, Set<String> wordSet, Set<String> memo) {
    if (memo.contains(word)) {
        return true;
    }
    
    for (int i = 1; i < word.length(); i++) {
        String prefix = word.substring(0, i);
        String suffix = word.substring(i);
        if (wordSet.contains(prefix) && (wordSet.contains(suffix) || isConcatenatedWord(suffix, wordSet, memo))) {
            memo.add(word);
            return true;
        }
    }
    
    return false;
}
