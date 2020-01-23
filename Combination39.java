import java.util.*;

public class Combination39 {

	/**
	 * Backtracking to calculate the remains
	 * @param candidates
	 * @param target
	 * @return
	 */
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		
		backtrack(result, new ArrayList<Integer>(), candidates, target, 0);
		
		return result;
    }
	
	private void backtrack (List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {
		
		if (target < 0) return;
		else if (target == 0) result.add(new ArrayList<Integer>(temp));
		else {
			
			for (int i=start; i<candidates.length; i++) {
				temp.add(candidates[i]);
				backtrack(result, temp, candidates, target-candidates[i], i);
				temp.remove(temp.size()-1);
			}
			
		}
	}
}
