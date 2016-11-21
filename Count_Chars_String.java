import java.util.*;

public class Count_Chars_String{
	public static void main(String[] args){
		Count_Chars_String m = new Count_Chars_String();
		String letter = "sangmyung university";
		m.countC(letter);
	}
	
	public void countC(String letters){
		char[] letter = letters.toCharArray();
		Map<String, Integer> words = new HashMap<String,Integer>();
		String w;
		for(char c:letter){
			w = Character.toString(c);
			if(words.containsKey(w)){
				words.put(w,words.get(w)+1);
			} else {
				words.put(w,1);
			}
		}
		System.out.println(words);
	}
	
}
