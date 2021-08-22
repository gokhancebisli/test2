    //Soru: Iki integer'i toplayan java programini yaziniz.

package week1_syso;

import java.util.Scanner;

public class syso_HW2 {

	public static void main(String[] args) {

		int sayi1, sayi2;

		Scanner scan = new Scanner(System.in);

		sayi1 = 10;
		sayi2 = 14;

		System.out.println("Sayilarin Toplami : " + (sayi1 + sayi2));
		
		scan.close();
	}
	
}

