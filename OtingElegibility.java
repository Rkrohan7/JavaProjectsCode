package bank;

import java.util.Scanner;

public class OtingElegibility {

	public static void main(String[] args) {
		String area = "Pune";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int AgeIs = sc.nextInt();
		System.out.println("Enter City:");
		String city = sc.nextLine();
		if (AgeIs <= 0 && AgeIs < 18) {
			System.out.println("Not Elagable for Oting");
			if (area.equals(city)) {
				System.out.println("Elagible for voting");
			}
		}

	}
}
