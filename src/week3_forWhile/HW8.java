//Soru : Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
package week3_forWhile;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Bir sayi giriniz: ");
	        int sayi = scan.nextInt();
	        
	        System.out.println("Girdiğiniz sayinin tersi = ");
	        while(sayi > 0) {
	            
	            System.out.print(sayi % 10);
	            sayi /= 10;
	        }
	        scan.close();
	    }

}


