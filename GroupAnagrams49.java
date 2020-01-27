import java.util.*;

public class GroupAnagrams49 {
	
	/**
	 * using hashmap to store the key and str info. if key is not in the hashmap, then add the str
	 * @param strs
	 * @return
	 */
	public List<List<String>> groupAnagrams(String[] strs) {
		
		if (strs == null) return new ArrayList<List<String>>();
		
		Map<String, List<String>> temp = new HashMap<String, List<String>>();
		for (String str : strs) {
			char[] c = str.toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if (!temp.containsKey(key))
				temp.put(key, new ArrayList<String>());
			temp.get(key).add(str);
		}
		
		return new ArrayList<List<String>>(temp.values());
    }
}
