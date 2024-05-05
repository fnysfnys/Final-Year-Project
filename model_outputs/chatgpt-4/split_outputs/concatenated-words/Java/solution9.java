import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        return Stream.of(words)
                     .filter(word -> canFormWithStreams(word, wordSet))
                     .collect(Collectors.toList());
    }

    private boolean canFormWithStreams(String word, Set<String> wordSet) {
        if (word.isEmpty()) return false;
        return Stream.iterate(1, i -> i <= word.length(), i -> i + 1)
                     .anyMatch(i -> wordSet.contains(word.substring(0, i)) 
                                  && (wordSet.contains(word.substring(i)) || canFormWithStreams(word.substring(i), wordSet)));
    }
}
