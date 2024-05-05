public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> result = new ArrayList<>();
    // Iterate through words array
    for (String word : words) {
        // Check if the word is a concatenated word
        if (isConcatenatedWord(word, new HashSet<>(Arrays.asList(words)))) {
            result.add(word);
        }
    }
    return result;
}

private boolean isConcatenatedWord(String word, Set<String> wordSet) {
    if (wordSet.contains(word)) {
        return true;
    }
    for (int i = 1; i < word.length(); i++) {
        String prefix = word.substring(0, i);
        String suffix = word.substring(i);
        if (wordSet.contains(prefix) && isConcatenatedWord(suffix, wordSet)) {
            return true;
        }
    }
    return false;
}
