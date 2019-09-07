package crux2019;

import java.util.Scanner;

public class ShortestRoadTrip {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int x = 0, y = 0;
		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);
			switch (ch) {
			case 'N': {
				y++;
				break;
			}
			case 'S': {
				y--;
				break;
			}
			case 'E': {
				x++;
				break;
			}
			case 'W': {
				x--;
				break;
			}
			}
		}
		String s2 = "";
		if (x > 0) {
			while (x > 0) {
				s2 = s2 + 'E';
				x--;
			}
		}
		if (y > 0) {
			while (y > 0) {
				s2 = s2 + 'N';
				y--;
			}
		}
		if (y < 0) {
			while (y < 0) {
				s2 = s2 + 'S';
				y++;
			}
		}
		if (x < 0) {
			while (x < 0) {
				s2 = s2 + 'S';
				x++;
			}
		}
		System.out.println("Shortest Path Is: " + s2);
	}

}
