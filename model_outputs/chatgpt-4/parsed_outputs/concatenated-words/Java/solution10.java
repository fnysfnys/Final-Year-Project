import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (iterativeDP(word, wordSet)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean iterativeDP(String word, Set<String> wordSet) {
        if (word.isEmpty()) return false;
        boolean[] dp = new boolean[word.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= word.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[word.length()] && !wordSet.contains(word);
    }
}
