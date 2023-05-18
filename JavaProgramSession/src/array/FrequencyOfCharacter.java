package array;

import java.util.Arrays;

public class FrequencyOfCharacter {

	void frequency(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					ch[j] = '\0';
				}
			}
			if (ch[i] != '\0') {
				System.out.println(ch[i] + " => " + cnt);
			}
		}
	}
	
	void frequencyChar(char ch[]) {
		boolean[] br = new boolean[ch.length];
		Arrays.fill(br, true);
		for (int i = 0; i < ch.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					cnt++;
					br[j]=false;
				}
			}
			if (br[i] == true) {
				System.out.println(ch[i] + " => " + cnt);
			}
		}
		
	}

	public static void main(String[] args) {
		char arr[] = { 'a', 'b', 'c', 'd', 'c', 'a', 'b', 'd', 'd', 'a', 'a' };
		char arr2[] = { 'a', 'b', 'c', 'd', 'c', 'a', 'b', 'd', 'd', 'a', 'a' };
		FrequencyOfCharacter obj = new FrequencyOfCharacter();
		obj.frequency(arr);
		System.out.println("==============");
		FrequencyOfCharacter obj1 = new FrequencyOfCharacter();
		obj1.frequencyChar(arr2);
	}

}
