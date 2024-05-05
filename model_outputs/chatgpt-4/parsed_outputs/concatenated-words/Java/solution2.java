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
        for (String word : words) {
            if (canFormWithSet(word, wordSet, "")) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean canFormWithSet(String word, Set<String> wordSet, String previous) {
        if (!previous.isEmpty() && wordSet.contains(word)) return true;
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            if (wordSet.contains(prefix)) {
                if (canFormWithSet(word.substring(i), wordSet, prefix)) {
                    return true;
                }
            }
        }
        return false;
    }
}
