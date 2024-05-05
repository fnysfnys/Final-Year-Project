def nthSuperUglyNumber(n, primes):
   root = Node(1)
   for i in range(n):
       root.children.append(Node(primes[i % len(primes)]))
   return root.value
