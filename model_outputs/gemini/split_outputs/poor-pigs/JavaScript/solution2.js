function poorPigs(buckets, minutesToDie, minutesToTest) {
  if (buckets <= 1) return 0;
  if (minutesToTest <= minutesToDie) return Math.ceil(minutesToTest / minutesToDie);

  let pigs = 1;
  let possibleOutcomes = 1;
  while (possibleOutcomes < buckets) {
    pigs++;
    possibleOutcomes *= pigs + 1;
  }
  return pigs;
}
