public List<String> findAllConcatenatedWordsInADict(String[] words) {
    List<String> result = new ArrayList<>();
    TrieNode root = new TrieNode();
    
    for (String word : words) {
        if (!word.isEmpty()) {
            insertWord(root, word);
        }
    }
    
    for (String word : words) {
        if (isConcatenatedWord(word, 0, root, 0)) {
            result.add(word);
        }
    }
    
    return result;
}

private void insertWord(TrieNode root, String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        if (node.children[c - 'a'] == null) {
            node.children[c - 'a'] = new TrieNode();
        }
        node = node.children[c - 'a'];
    }
    node.isEndOfWord = true;
}

private boolean isConcatenatedWord(String word, int index, TrieNode root, int count) {
    TrieNode node = root;
    for (int i = index; i < word.length(); i++) {
        char c = word.charAt(i);
        if (node.children[c - 'a'] == null) {
            return false;
        }
        node = node.children[c - 'a'];
        if (node.isEndOfWord) {
            if (i == word.length() - 1) {
                return count >= 1;
            }
            if (isConcatenatedWord(word, i + 1, root, count + 1)) {
                return true;
            }
        }
    }
    return false;
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}
