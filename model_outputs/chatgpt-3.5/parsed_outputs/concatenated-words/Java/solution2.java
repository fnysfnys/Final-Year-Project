class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = new TrieNode();
        
        // Build a trie from the words
        for (String word : words) {
            if (!word.isEmpty()) {
                insertWord(root, word);
            }
        }
        
        // Check for concatenated words
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
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    private boolean isConcatenatedWord(String word, int index, TrieNode root, int count) {
        TrieNode node = root;
        for (int i = index; i < word.length(); i++) {
            int charIndex = word.charAt(i) - 'a';
            if (node.children[charIndex] == null) {
                return false;
            }
            node = node.children[charIndex];
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
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}