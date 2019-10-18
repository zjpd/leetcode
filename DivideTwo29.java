
public class DivideTwo29 {
	public int divide(int dividend, int divisor) {
        
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
			sign = -1;
		
		long ldividend = Math.abs(dividend);
		long ldivisor = Math.abs(divisor);
		if (ldividend == Integer.MIN_VALUE) {
			ldividend = Integer.MAX_VALUE;
			ldividend ++;
		}
		System.out.println("dividend: "+ldividend+" divisor: "+ldivisor);
		
		if (ldivisor == 0) return Integer.MAX_VALUE;
		if ((ldividend == 0) || (ldividend < ldivisor)) return 0;
		
		long answer = getAnswer(ldividend, ldivisor);
		int ans;
		
		if(answer > Integer.MAX_VALUE) {
			ans = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		} else {
			ans = (int) (sign * answer);
		}
		return ans;
    }
	
	public long getDivide(long ldividend, long ldivisor) {
		
		if (ldividend < ldivisor) return 0;
		long multiple = 1;
		long sum = ldivisor;
		
		while ((sum+sum) < ldividend) {
			sum += sum;
			multiple += multiple;
		}
		
		return multiple + getDivide(ldividend-sum, ldivisor);
	}
	
	public long getAnswer(long ldividend, long ldivisor) {
		
		long ans = 0;
		while(ldividend > ldivisor) {
			ldividend -= ldivisor;
			ans ++;
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		new DivideTwo29().divide(-2147483648, -1);
	}
}
