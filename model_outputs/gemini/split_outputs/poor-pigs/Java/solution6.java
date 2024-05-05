public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
  int pigs = 0;
  while ((1 << pigs) < buckets) {
    pigs++;
  }
  int maxRounds = minutesToTest / minutesToDie;
  int mask = (1 << pigs) - 1;
  for (int i = 0; i <= maxRounds; i++) {
    if ((mask >> i & mask) == buckets - 1) {
      return pigs;
    }
  }
  throw new RuntimeException("No solution found");
}
