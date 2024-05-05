import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> result = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        Map<String, Boolean> memo = new HashMap<>();
        for (String word : words) {
            if (canFormWithMemo(word, wordSet, memo)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean canFormWithMemo(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) return memo.get(word);
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            if (wordSet.contains(prefix)) {
                String suffix = word.substring(i);
                if (wordSet.contains(suffix) || canFormWithMemo(suffix, wordSet, memo)) {
                    memo.put(word, true);
                    return true;
                }
            }
        }
        memo.put(word, false);
        return false;
    }
}
