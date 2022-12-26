package com.string;

public class CheckSubString {

	public static boolean check(String s1, String s2, int a, int b) {

		for (int i = 0; i < b; i++) {// s2 string

			for (int j = 0; j < a; j++) {// s1 string

				if (s2.charAt(i) == s1.charAt(j))
					break;

				if (j == b)
					return false;

			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kalyaniwani";
		String s2 = "kalyani";
		int a = s1.length();
		int b = s2.length();
		if (check(s1, s2, a, b)) {
			System.out.println("s2 is substring of s1");
		} else {
			System.out.println("s2 is not substring of s1");
		}

	}

}
