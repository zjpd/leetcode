import java.util.HashSet;

public class IsHappy202 {
	
	public boolean isHappy(int n) {
		HashSet<Integer> storage = new HashSet<Integer>();
		if (n==0) return false;
		int result = 0;
		while (storage.add(result)) {
			result = getSum(n);
			n = result;
			if (result == 1) return true;
		}
		
		return false;
    }
	
	public int getSum(int n) {
		int sum = 0;
		while (n>0) {
			int a = n % 10;
			sum += a*a;
			n = n/10;
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		new IsHappy202().isHappy(19);
	}
}
