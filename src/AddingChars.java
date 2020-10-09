import java.util.Arrays;
import java.util.Scanner;

public class AddingChars {

	public static void main(String[] args) {
		while (true) {
			Scanner sn = new Scanner(System.in);
			System.out.println("Enter a numeric string: ");
			String digits = sn.next();
			if (digits.length() == 0)
				break;
			System.out.println(addCommasToNumericString(digits));
		}
	}

	private static String addCommasToNumericString(String digits) {
		String reverseDigits = reverseString(digits);
		char[] newDigitsArr = createNewDigitsArray(reverseDigits.length());
		String newDigit = getMoneyString(newDigitsArr, reverseDigits);
		return newDigit;
	}

	private static String getMoneyString(char[] newDigitsArr, String reverseDigits) {
		int insertedCommas = 0;
		for(int i = 0; i < newDigitsArr.length; i++) {
			newDigitsArr[i] = ' ';
		}
		for (int i = 0; i < reverseDigits.length(); i++) {
			if (i >= 1 && i % 3 == 0) {
				newDigitsArr[i + insertedCommas] = '/';
				insertedCommas++;
				newDigitsArr[i + insertedCommas] = reverseDigits.toCharArray()[i];
			} else {
				newDigitsArr[i + insertedCommas] = reverseDigits.toCharArray()[i];
			}
		}
		String newDigits = Arrays.toString(newDigitsArr).replaceAll(",", "").replaceAll("/", ",").replaceAll("]", "")
				.replace("[", "").replace(" ", "");		
		return reverseString(newDigits);
	}

	private static String reverseString(String toReverse) {
		toReverse = new StringBuilder(toReverse).reverse().toString();
		return toReverse;
	}
	private static char[] createNewDigitsArray(int currentArrayLenght) {
		char[] newDigitsArr = new char[currentArrayLenght += currentArrayLenght / 3];
		return newDigitsArr;
	}
	
}
