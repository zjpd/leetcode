
public class ReverseNode26 {
	
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		
		int pointer = nums[0];
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if (nums[i] != pointer) {
				count ++;
				pointer = nums[i];
				nums[count] = nums[i];
			}
				
		}
		
		return count;
    }
	
	public static void main(String args[]) {
		int[] nums = new int[] {1,1,2};
		System.out.println(new ReverseNode26().removeDuplicates2(nums));
	}
	
	public int removeDuplicates2(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
}
