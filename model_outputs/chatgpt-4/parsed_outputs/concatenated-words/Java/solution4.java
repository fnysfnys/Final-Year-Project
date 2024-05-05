import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        for (String word :

words) {
            if (dfs(word, wordSet, 0)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean dfs(String word, Set<String> wordSet, int start) {
        if (start == word.length()) return false;
        for (int end = start + 1; end <= word.length(); end++) {
            if (wordSet.contains(word.substring(start, end)) 
                && (end == word.length() || dfs(word, wordSet, end))) {
                if (end < word.length()) return true; // Ensure at least two words
            }
        }
        return false;
    }
}
