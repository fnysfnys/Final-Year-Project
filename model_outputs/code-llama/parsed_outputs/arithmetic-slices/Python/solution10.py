import seaborn as sns

class Solution(object):
    def numberOfArithmeticSlices(self, nums):
       return len(sns.lineplot(x=nums).get_lines())
    
