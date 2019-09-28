
public class Container {

	public static void main(String[] args) {
		int[] arr = {2,9,5,23,12,7,13,1};
		int[] arr2 = {1,8,6,2,5,4,8,3,7};
		System.out.print(new Container().maxArea(arr2));
	}
	
	public int maxArea(int[] height) {
		
		if(height.length<2) return 0;
		if(height.length==2) return height[0]>height[1] ? height[1]:height[0];
		
		int maxArea = 0;
		for (int i=0; i<height.length-1; i++) {
			for (int j=1; j<height.length; j++) {
				
				int area = (height[i]>height[j] ? height[j]:height[i]) * (j-i);
				maxArea = maxArea>area ? maxArea:area;
			}
			
		}
		
		
        return maxArea;
    }
	
}
