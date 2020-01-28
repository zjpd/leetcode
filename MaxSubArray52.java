
public class MaxSubArray52 {

	public int maxSubArray(int[] nums) {
		
		int max = nums[0], maxCur = nums[0];
		
		for (int i=1; i<nums.length; i++) {
			maxCur = Math.max(maxCur+nums[i], nums[i]);
			max = Math.max(max, maxCur);
		}
		
		return max;
    }
}
