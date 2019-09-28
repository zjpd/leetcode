import java.util.Stack;

public class Valid20 {

	public static void main(String[] args) {

	}
	
	public boolean isValid(String s) {
		
		char[] arr = s.toCharArray();
		if (arr.length == 1) return false;
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for (int i=0; i<arr.length; i++) {
			
			switch (arr[i]) {
				
			case '{':
				left.push('{');
				right.push('}');
				break;
				
			case '(':
				left.push('(');
				right.push(')');
				break;
				
			case '[':
				left.push('[');
				right.push(']');
				break;
			
			case '}':
				if(right.empty())
					return false;
				if (right.peek() == '}') {
					
					right.pop();
					left.pop();
				
				} else {
					return false;
				}
				break;
				
			case ']':
				if(right.empty())
					return false;
				if (right.peek() == ']') {
					
					right.pop();
					left.pop();
					
				} else {
					return false;
				}
				break;
				
			case ')':
				if(right.empty())
					return false;
				if (right.peek() == ')') {
					
					right.pop();
					left.pop();
				
				} else {
					return false;
				}
				break;
			
			}
			
		}
		
		if (left.empty() && right.empty())
			return true;
		else
			return false;
	}
	
}
