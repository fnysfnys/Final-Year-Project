class Solution {
    /**
     * Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
     *      
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        return IntStream.rangeClosed(1, n)
                        .mapToObj(i -> generateNumbers(i, "", new boolean[10]))
                        .flatMap(List::stream)
                        .collect(Collectors.toSet())
                        .size() + 1; // Including 0
    }

    private List<String> generateNumbers(int n, String current, boolean[] used) {
        if (current.length() == n) {
            return Collections.singletonList(current);
        }
        return IntStream.range(0, 10)
                        .filter(i -> !used[i] && (current.length() > 0 || i != 0))
                        .peek(i -> used[i] = true)
                        .mapToObj(i -> generateNumbers(n, current + i, used))
                        .flatMap(List::stream)
                        .peek(str -> used[Character.getNumericValue(str.charAt(str.length() - 1))] = false)
                        .collect(Collectors.toList());
    }
}
