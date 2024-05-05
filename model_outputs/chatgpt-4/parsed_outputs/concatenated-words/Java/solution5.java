import java.util.List;
import java.util.ArrayList;

public class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }

    private void addWord(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            if (!word.isEmpty()) {
                addWord(root, word);
            }
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (canFormUsingTrie(word, root, 0, 0)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean canFormUsingTrie(String word, TrieNode root, int start, int count) {
        TrieNode node = root;
        for (int i = start; i < word.length(); i++) {
            if (node.children[word.charAt(i) - 'a'] == null) return false;
            node = node.children[word.charAt(i) - 'a'];
            if (node.isWord && (i == word.length() - 1 && count >= 1 || canFormUsingTrie(word, root, i + 1, count + 1))) {
                return true;
            }
        }
        return false;
    }
}
