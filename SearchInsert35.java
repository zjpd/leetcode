
public class SearchInsert35 {
	
	/**
	 * binary search, but could be composed as 1 method
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		
		if (target < nums[0]) return 0;
		if (target > nums[nums.length-1]) return nums.length;
		
		int res = -1;
		
		res = findNum(nums, target);
		
		if (res == -1) {
			
			res = findPos(nums, target);
			
		} else return res;
		
		return res;
    }
	
	private int findPos (int[] nums, int target) {
		int left = 0, right = nums.length-1;
		
		while (left <= right) {
			int mid = left + (right-left)/2;
			
			if (nums[mid] > target) right = mid-1;
			else left = mid+1;
			
		}
		return left;
	}
	
	private int findNum (int[] nums, int target) {
		
		int index = -1;
		int left = 0, right=nums.length-1;
		
		while (left <= right) {
			
			int mid = left + (right-left)/2;
			
			if (nums[mid] == target) index = mid;
			
			if (nums[mid] >= target) right = mid-1;
			else left = mid + 1;
		}
		
		return index;
	}
}
