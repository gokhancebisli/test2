//Soru : Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

package week1_syso;

import java.util.Scanner;

public class syso_HW5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("eni giriniz:");
		int en = scan.nextInt();
		System.out.println("boyu giriniz:");
		int boy = scan.nextInt();
		int alan = en * boy;
		int cevre = 2 * (en + boy);
		System.out.println("dikdörtgenin alani:" + alan);
		System.out.println("dikdörtgenin cevresi:" + cevre);

		scan.close();
	}

}
