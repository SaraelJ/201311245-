public class Reverse_Hello{
	public static void main(String[] args) {
		Reverse_Hello r = new Reverse_Hello();
		String words = "Hello";
		r.rev(words);
	}
	
	public void rev(String words){
		char[] word = words.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for(int i=word.length-1;i>=0;i--){
			reverse.append(word[i]);
		}
		System.out.println(reverse);
	}
	
}
