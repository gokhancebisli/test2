//Soru :Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

package week2_scanner;

import java.util.Scanner;

public class scanner_HW1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("sayi girin:");
		int sayi = scan.nextInt();
		System.out.println("sayinin küpünün yarisi:" + (sayi * sayi * sayi) / 2);
		scan.close();

	}
}
