
public class ImpleStr28 {
	public int strStr(String haystack, String needle) {
        if (haystack.isEmpty()) return -1;
        if (needle.isEmpty()) return 0;
        
        char[] str = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        
        if (str.length < pattern.length) return -1;
        int pointer = 0;
        int len = str.length - pattern.length + 1;
        
        while (pointer < len) {
        	
        	int pointer2 = 0;
        	if(str[pointer] == pattern[pointer2]) {
        		
        		pointer2 ++;
        		boolean findNeedle = true;
        		while (pointer2 < pattern.length && findNeedle) {
        			if (str[pointer+pointer2] == pattern[pointer2]) 
        				pointer2 ++;
        			 else 
        				findNeedle = false;
        			
        		}
        		
        		if (findNeedle) return pointer;
        	}
        	
        	pointer ++;
        }
        
        return -1;
    }
}
