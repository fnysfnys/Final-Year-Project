class Solution {
    class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEnd;
        
        TrieNode() {
            children = new HashMap<>();
            isEnd = false;
        }
    }
    
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = new TrieNode();
        
        for (String word : words) {
            if (!word.isEmpty()) {
                insertWord(root, word);
            }
        }
        
        for (String word : words) {
            if (!word.isEmpty() && canFormConcatenatedWord(root, word, 0, 0)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    private void insertWord(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEnd = true;
    }
    
    private boolean canFormConcatenatedWord(TrieNode root, String word, int index, int count) {
        TrieNode node = root;
        for (int i = index; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
            if (node.isEnd) {
                if (i == word.length() - 1) {
                    return count >= 1; // Ensure at least two shorter words
                }
                if (canFormConcatenatedWord(root, word, i + 1, count + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
