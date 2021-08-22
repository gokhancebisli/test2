//Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını 
//ve çevresini konsola yazdıran bir program yazın.

package week2_scanner;

import java.util.Scanner;

public class scanner_HW3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("eni giriniz..");
		int en = scan.nextInt();
		
		System.out.println("boyu giriniz..");		
		int boy = scan.nextInt();
		
		int alan = en * boy;
		int cevre = 2 * (en + boy);
		
		
		System.out.println("Alan: " + alan);
		System.out.println("Cevre: " + cevre);

		scan.close();
	}

}
