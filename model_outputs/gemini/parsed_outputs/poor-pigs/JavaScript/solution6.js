function poorPigs(buckets, minutesToDie, minutesToTest) {
  if (buckets <= 1) return 0;
  if (minutesToTest <= minutesToDie) return Math.ceil(minutesToTest / minutesToDie);

  let pigs = 1;
  let combinations = 1;
  while (combinations < buckets) {
    pigs++;
    combinations += choose(pigs, minutesToTest / minutesToDie);
  }
  return pigs;
}

function choose(n, k) {
  if (k > n) return 0;
  if (k === 0 || k === n) return 1;
  return choose(n - 1, k - 1) + choose(n - 1, k);
}
