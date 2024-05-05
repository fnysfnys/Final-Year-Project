class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;
    }

    public int findSubstringInWraproundString(String s) {
        TrieNode root = new TrieNode();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            TrieNode node = root;
            for (int j = i; j < s.length(); j++) {
                if (node.children[s.charAt(j) - 'a'] == null) {
                    node.children[s.charAt(j) - 'a'] = new TrieNode();
                    count++;
                }
                node = node.children[s.charAt(j) - 'a'];
                if (j > i && (s.charAt(j) - s.charAt(j

- 1) != 1 && s.charAt(j - 1) - s.charAt(j) != 25)) break;
            }
        }

        return count;
    }
}