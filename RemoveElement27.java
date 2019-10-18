
public class RemoveElement27 {
	public int removeElement(int[] nums, int val) {
        
		if (nums.length == 0) return 0;
		int count = 0;
		for (int i=0; i<nums.length; i++) {
			
			if (nums[i] == val) {
				for2:
				for (int j= i+1; j<nums.length; j++) {
					if (nums [j] != val) {
						nums[i] = nums[j];
						nums[j] = val;
						count ++;
						break for2;
					}
				}
			} else {
				count ++;
			}
		}
		
        return count;
        
    }
	
	public static void main(String args[]) {
		int[] nums = new int[] {3,2,2,3};
		System.out.println(new RemoveElement27().removeElement(nums, 3));
	}
}
