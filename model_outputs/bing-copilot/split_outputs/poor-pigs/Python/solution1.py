     import math

     def poorPigs(buckets, minutesToDie, minutesToTest):
         rounds = minutesToTest // minutesToDie
         return math.ceil(math.log(buckets, rounds + 1))
     