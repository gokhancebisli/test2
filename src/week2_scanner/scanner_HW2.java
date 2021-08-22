//Soru: Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve 
//      çevresini konsola yazdıran bir program yazıniz.

package week2_scanner;

import java.util.Scanner;

public class scanner_HW2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kenar uzunlugunu giriniz:");
		int kenar=scan.nextInt();
		int alan=kenar*kenar;
		int cevre=kenar*4;
		System.out.println("Alan: "+alan);
		System.out.println("Cevre: "+cevre);

		scan.close();
		         }
		}
	


