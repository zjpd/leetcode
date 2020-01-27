import java.util.*;

public class Permutation46 {
	
	/**
	 * backtrack, similar as combination 40
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		backtrack(res, new ArrayList<Integer>(), nums);
		
		return res;
    }
	
	private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
		
		if (temp.size() == nums.length) 
			res.add(new ArrayList<Integer>(temp));
		else {
			for (int i=0; i<nums.length; i++) {
				if (temp.contains(nums[i])) continue;
				temp.add(nums[i]);
				backtrack(res, temp, nums);
				temp.remove(temp.size()-1);
			}
		}
	}
}
