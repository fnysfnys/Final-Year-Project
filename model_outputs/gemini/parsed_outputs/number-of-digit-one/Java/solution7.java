class Solution {
    public int countDigitOne(int n) {
      return IntStream.rangeClosed(1, n)
          .boxed()
          .mapToInt(String::valueOf)
          .flatMapToInt(s -> s.chars().filter(c -> c == '1'))
          .count();
    }
    
}
