import java.util.ArrayList;
import java.util.List;

public class Generate22 {
	
	public List<String> generateParenthesis(int n) {
		
		List<String> result = new ArrayList<String>();
		
		if (n == 0) return null;
		generateParRe("", n, n, result);
		
		return result;
    }
	
	public void generateParRe(String prefix, int left, int right, List<String> result) {
		
		if (left == 0 && right == 0) result.add(prefix);
		
		if (left > 0) generateParRe (prefix+'(', left-1, right, result);
		
		if (left < right) generateParRe (prefix+')', left, right-1, result);
		
	}
}
