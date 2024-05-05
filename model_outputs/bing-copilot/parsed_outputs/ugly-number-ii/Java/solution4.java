class Solution {
    public int nthUglyNumber(int n) {
        Set<Long> uglySet = new TreeSet<>();
        uglySet.add(1L);
    
        while (uglySet.size() < n) {
            long smallest = uglySet.iterator().next();
            uglySet.remove(smallest);
            uglySet.add(smallest * 2);
            uglySet.add(smallest * 3);
            uglySet.add(smallest * 5);
        }
    
        return uglySet.iterator().next().intValue();
    }
    
}
