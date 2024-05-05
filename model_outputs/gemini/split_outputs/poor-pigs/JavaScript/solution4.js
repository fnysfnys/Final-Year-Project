function poorPigs(buckets, minutesToDie, minutesToTest) {
  if (buckets <= 1) return 0;
  if (minutesToTest <= minutesToDie) return Math.ceil(minutesToTest / minutesToDie);

  let pigs = 0;
  let mask = (1 << buckets) - 1;
  while ((mask & (mask + 1)) !== 0) {
    mask &= mask + 1;
    pigs++;
  }
  return pigs;
}
