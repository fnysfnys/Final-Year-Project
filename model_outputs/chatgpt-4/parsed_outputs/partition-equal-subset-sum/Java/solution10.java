public class Solution {
    /**
     * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
     * 
     * Example:
     * Input: candidates = [2,3,6,7], target = 7
     * Output: [[2,2,3],[7]]
     * Explanation: 2 and 3 are candidates, and 2*2 + 3 = 7. Note that 2 can be used multiple times.
     *              7 is a candidate, and 7 = 7.
     *              These are the only two combinations.
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates); // optional for efficiency
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] candidates, int remain, int start){
        if (remain < 0) return; // if the remaining sum is less than 0, backtrack
        else if (remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for (int i = start; i < candidates.length; i++){
                tempList.add(candidates[i]);
                backtrack(list, tempList, candidates, remain - candidates[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}