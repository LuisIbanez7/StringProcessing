import java.util.StringTokenizer;

public class DeleteingCharsInStrings{

	public static void main(String[] args) {
		System.out.println(removeAllOccurrences("This is a test", 't'));
		System.out.println(removeAllOccurrences("Summer is here!", 'e'));
		System.out.println(removeAllOccurrences("---0---", '-'));
	}
	public static String removeAllOccurrences(String original, char ch) {
		String str = "";
		StringTokenizer tokenizer = new StringTokenizer(original,Character.toString(ch)); 
		for(int count = 0; tokenizer.hasMoreTokens(); count++) {
			str += tokenizer.nextToken();
		}
		return str;
	}
}
