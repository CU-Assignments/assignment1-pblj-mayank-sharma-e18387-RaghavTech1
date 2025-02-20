import java.util.Scanner;

class TextAnalyzer {
	private String text;

	public TextAnalyzer(String text) {
		this.text = text;
	}

	public int countVowels() {
		String vowels = "AEIOUaeiou";
		int count = 0;
		for (char c : text.toCharArray()) {
			if (vowels.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}

	public int countConsonants() {
		String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
		int count = 0;
		for (char c : text.toCharArray()) {
			if (consonants.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}

	public int countWords() {
		String[] words = text.split("\\s+");
		return words.length;
	}

	public int countWhitespaces() {
		int count = 0;
		for (char c : text.toCharArray()) {
			if (Character.isWhitespace(c)) {
				count++;
			}
		}
		return count;
	}

	public int countSpecialCharacters() {
		String specialcharacters = "@#$%^&*!";
		int count = 0;
		for (char c : text.toCharArray()) {
			if (specialcharacters.contains(String.valueOf(c))) {
				count++;
			}
		}
		return count;
	}
}

public class consonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String user_input = scanner.nextLine();
		scanner.close();

		TextAnalyzer analyzer = new TextAnalyzer(user_input);

		int vowelCount = analyzer.countVowels();
		int consonantCount = analyzer.countConsonants();
		int wordCount = analyzer.countWords();
		int whitespaceCount = analyzer.countWhitespaces();
		int specialcharacters = analyzer.countSpecialCharacters();

		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonants: " + consonantCount);
		System.out.println("Words: " + wordCount);
		System.out.println("Whitespaces: " + whitespaceCount);
		System.out.println("Special CHaracters: " + specialcharacters);
	}
}