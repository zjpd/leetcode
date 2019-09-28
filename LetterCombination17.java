import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombination17 {
	
	public HashMap<Character, String> getMap() {
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put('2', "abc"); map.put('3', "def");
		map.put('4', "ghi"); map.put('5', "jkl");
		map.put('6', "mno"); map.put('7', "pqrs");
		map.put('8', "tuv"); map.put('9', "wxyz");
		
		return map;
	}
	
	public  List<String> letterCombinations(String digits) {
		char[] tmp = new char[digits.length()];
		List<String> result = new ArrayList<String>();
		tmp = digits.toCharArray();
		
		if(digits.length() == 0)
			return result;
		
		String str = "";
		readNum(result, getMap(), tmp, 0, str);
		
        return result;
    }
	
	private void readNum(List<String> result, HashMap<Character, String> map, char[] chars, int index, String str) {
		if(index == chars.length) {
			result.add(str);
		} else {
			for(char c : map.get(chars[index]).toCharArray()) {
				readNum(result, map, chars, index+1, str+c);
			}
		}
	}
}
