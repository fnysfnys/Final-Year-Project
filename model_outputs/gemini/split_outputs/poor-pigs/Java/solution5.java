public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
  if (buckets <= 1) {
    return 0;
  }
  if (minutesToTest <= minutesToDie) {
    return 1;
  }
  int maxRounds = minutesToTest / minutesToDie;
  int pigsNeededForSingleRound = poorPigs(buckets / (maxRounds + 1), minutesToDie, minutesToTest - minutesToDie);
  return 1 + pigsNeededForSingleRound;
}
