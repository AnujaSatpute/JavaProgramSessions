package string_program;

import java.util.Arrays;

public class OccuranceOfWord {
	static void occurance() {
		String str = "Core Java . Advance Java . Core Java is good . Java is easy";
		String str1[] = str.split(" ");

		boolean b[] = new boolean[str1.length];
		Arrays.fill(b, true);

		System.out.println(Arrays.toString(str1));

		for (int i = 0; i < str1.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < str1.length - 1; j++) {
				if (str1[i].equalsIgnoreCase(str1[j])) {
					cnt++;
					b[j] = false;
					// str1[j] = "\0";
				}
			}
			// if (str1[i] != "\0" && str1[i] != " ") {
			if (b[i] == true)
				System.out.println(str1[i] + " --> " + cnt);
			// }
		}
	}

	static void removeOccurance() {
		String str = "Core Java . Advance Java . Core Java is good . Java is easy";
		System.out.println("Old String : " + str);
		String strr[] = str.split(" ");
		System.out.println(Arrays.toString(strr));
		for (int i = 0; i < strr.length; i++) {
			if (strr[i].equalsIgnoreCase("Java")) {
				strr[i] = null;
			}
		}
		String s1 = " ";
		for (int i = 0; i < strr.length; i++) {
			if (strr[i] != null) {
				s1 = s1 + strr[i] + " ";
			}
		}
		System.out.println("new String : " + s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurance();
		removeOccurance();
	}

}
