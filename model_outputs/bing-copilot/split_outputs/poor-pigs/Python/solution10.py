      import random

      def poorPigs(buckets, minutesToDie, minutesToTest):
          pigs = 0
          while True:
              pigs += 1
              for _ in range(minutesToTest // minutesToDie):
                  if random.random() < 1.0 / buckets:
                      return pigs
      