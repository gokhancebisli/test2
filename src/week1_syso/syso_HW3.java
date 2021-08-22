//Verilen integer sayilarin Toplamini, carpimini, 
//cikarma islemini ve bolme islemini yapan java kodunu yaziniz.

package week1_syso;

import java.util.Scanner;

public class syso_HW3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int sayi2 = scan.nextInt();
		System.out.println("sayilarin toplami:" + (sayi1 + sayi2));
		System.out.println("sayilarin carpimi:" + (sayi1 * sayi2));
		System.out.println("sayilarin cikarmasi:" + (sayi1 - sayi2));
		System.out.println("sayilarin bölümü:" + (sayi1 / sayi2));
		scan.close();
	}
	
}