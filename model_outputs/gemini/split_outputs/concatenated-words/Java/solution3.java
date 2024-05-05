public List<String> findAllConcatenatedWordsInADict(String[] words) {
    TrieNode root = new TrieNode();
    List<String> result = new ArrayList<>();
    for (String word : words) {
        insert(root, word);
        if (check(root, word, 0)) {
            result.add(word);
        }
    }
    return result;
}

private void insert(TrieNode root, String word) {
    TrieNode node = root;
    for (char c : word.toCharArray()) {
        int idx = c - 'a';
        if (node.children[idx] == null) {
            node.children[idx] = new TrieNode();
        }
        node = node.children[idx];
    }
    node.isEnd = true;
}

private boolean check(TrieNode root, String word, int start) {
    if (start == word.length()) {
        return true;
    }
    TrieNode node = root;
    for (int i = start; i < word.length(); i++) {
        int idx = word.charAt(i) - 'a';
        if (node.children[idx] == null) {
            return false;
        }
        node = node.children[idx];
        if (node.isEnd && i != word.length() - 1 && check(root, word, i + 1)) {
            return true;
        }
    }
    return node.isEnd && start == 0;
}
