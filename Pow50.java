
public class Pow50 {
	
	/**
	 * need to consider when n== integer.min_value, may result in overflow
	 * @param x
	 * @param n
	 * @return
	 */
	public double myPow(double x, int n) {
		
		if (n==0) return 1;
		if (n == Integer.MIN_VALUE && x>1) return 0;
		
		if (n<0) {
			n = -n;
			x = 1/x;
		}
		return (n%2==0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}
