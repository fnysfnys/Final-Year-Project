public class Solution {
  public int findSubstringInWraproundString(String s) {
    TrieNode root = new TrieNode();
    for (char c : s.toCharArray()) {
      root.insert(c);
    }
    return dfs(root, 0);
  }

  private int dfs(TrieNode node, int prev) {
    int count = 0;
    for (int i = 0; i < 26; i++) {
      int next = (prev + 1) % 26;
      if (node.children[i] != null) {
        if (Math.abs(next - prev) == 1 || next == prev) {
          count += dfs(node.children[i], next) + 1;
        } else {
          count += dfs(node.children[i], next);
        }
      }
    }
    return count;
  }

  private static class TrieNode {
    TrieNode[] children = new TrieNode[26];
  }
}
