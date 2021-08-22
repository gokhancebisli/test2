//Soru : Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. 
//Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

package week2_scanner;

import java.util.Scanner;

public class scanner_HW4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("gunde kac bardak cay iciyorsunuz?");
		int bardak = scan.nextInt();
		
		System.out.println("her bardak icin kac gr seker kullaniyorsunuz?");
		int seker = scan.nextInt();
		
		double sekermiktari = bardak*seker*365;
		
		System.out.println("Yilda kullandiginiz seker miktari:"+sekermiktari/1000+" kg'dir.");
		scan.close();
		
	}
	

}
