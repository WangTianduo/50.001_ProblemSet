import java.util.*;

public class Pset1 {	
	public static boolean isAllCharacterUnique(String sIn) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < sIn.length(); i++) {
			char c = sIn.charAt(i);
			if(hm.containsKey(c)) {
				return false;
			}else {
				hm.put(c, 1);
			}
		}
		return true;
	}
	public static boolean isPermutation(String sIn1, String sIn2) {	
		if(sIn1.length()!=sIn2.length()){
					return false;
		}
		HashMap<Character, Integer> ht = new HashMap<>();
		for(int i=0;i<sIn1.length();i++){
			char c = sIn1.charAt(i);
			if(ht.containsKey(c)){
				int val = ht.get(c) + 1;
				ht.put(c, val);
			}else{
				ht.put(c, 1);
			}
		}
		for(int i=0;i<sIn2.length();i++){
			char c = sIn2.charAt(i);
			if(ht.containsKey(c)){
				int val = (int)ht.get(c);
				if(val==0){
					return false;
				}
				val--;
				ht.put(c, val);
			}else{
				return false;
			}
		}
		Set keys = ht.keySet();
		Iterator<Character> iterator = keys.iterator();
		while(iterator.hasNext()){
			char c = iterator.next();
			if(ht.get(c)!=0){
				return false;
			}
		}
		return true;
	}
}