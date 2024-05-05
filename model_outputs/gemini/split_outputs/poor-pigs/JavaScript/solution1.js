function poorPigs(buckets, minutesToDie, minutesToTest) {
  if (buckets <= 1) return 0;
  if (minutesToTest <= minutesToDie) return Math.ceil(minutesToTest / minutesToDie);

  let pigs = 1;
  let possibleOutcomes = Math.pow(2, pigs);
  while (possibleOutcomes < buckets) {
    pigs++;
    possibleOutcomes *= Math.pow(2, pigs);
  }
  return pigs;
}
