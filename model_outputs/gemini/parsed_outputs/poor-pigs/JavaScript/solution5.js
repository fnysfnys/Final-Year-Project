function poorPigs(buckets, minutesToDie, minutesToTest) {
  if (buckets <= 1) return 0;
  if (minutesToTest <= minutesToDie) return Math.ceil(minutesToTest / minutesToDie);

  return Math.ceil(Math.log2(buckets) / Math.log2(minutesToTest / minutesToDie + 1));
}
