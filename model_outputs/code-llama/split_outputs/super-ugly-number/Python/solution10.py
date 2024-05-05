def nthSuperUglyNumber(n, primes):
   graph = Graph()
   for i in range(n):
       graph.add_node(Node(primes[i % len(primes)]))
   for i in range(n):
       for j in range(i):
           graph.add_edge(i, j)
   return graph.nodes[n].value
