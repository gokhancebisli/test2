//Soru : Dairenin alanini ve cevresini hesaplayan java kodunu yaziniz.

package week1_syso;

import java.util.Scanner;

public class syso_HW4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
	       System.out.println("Dairenin yaricapini giriniz: ");
	        int yaricap = scan.nextInt();

	        System.out.println("Dairenin Cevresi: "+ (2 * 3.14 * yaricap));
	        
	        System.out.println("Dairenin Alanı: " + (3.14 * yaricap * yaricap));
	    
	scan.close();

	  }
	}
	    

	



