package com.in28minutes.primitive.datatypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// a e i o u A E I O U
		if (this.ch == 'a' || this.ch == 'e' || this.ch == 'i' || this.ch == 'o' || this.ch == 'u' || this.ch == 'A'
				|| this.ch == 'E' || this.ch == 'I' || this.ch == 'O' || this.ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		if (!isVowel() && isAlphabet()) {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		// between 0 and 9 -> ch>=48 && ch<=57
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		// 'a' = 97, 'z' = 122, 'A' = 65, 'Z' = 90
		if (ch >= 97 && ch <= 122) {
			return true;
		}
		if (ch >= 65 && ch <= 90) {
			return true;
		}

		return false;
	}

	public static void printLowerCaseAlphabets() {
		// 'a' to 'z'
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
