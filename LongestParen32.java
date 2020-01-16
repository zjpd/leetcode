import java.util.*;

public class LongestParen32 {
	
	/**
	 * Firstly scanned the string
	 * if the char is (, then record its index
	 * if the char is ), then check the stack
	 * if the stack is not empty, then pop the stack and set the temp array[stack.pop] = 1
	 * and set the temp array[i] = 1
	 * then check the temp array to find the longest parentheses
	 * for example, the input is ()((), then the temp array should be 11011
	 * @param s
	 * @return
	 */
	public int longestValidParentheses(String s) {
		
		int longest = 0;
		Stack<Integer> s1 = new Stack<Integer>();
		int replica[] = new int[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			
			if (s.charAt(i) == '(')
				s1.push(i);
			else {
				if(!s1.isEmpty()) {
					replica[i] = 1;
					replica[s1.pop()] = 1;
				}
			}
		}
		
		int cur = 0;
		for (int i=0; i<replica.length; i++) {
			if(replica[i] == 1) cur++;
			else {
				longest = Math.max(longest, cur);
				cur = 0;
			}
		}

		return Math.max(longest,cur);
    }
	
	public static void main(String args[]) {
		String test = "()(()";
		String test2 = "(()";
		LongestParen32 t = new LongestParen32();
		System.out.println(t.longestValidParentheses(test2));
	}
	
}
