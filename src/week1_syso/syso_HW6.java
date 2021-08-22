//Soru : Verilen 5 sayinin ortalamasini hesaplayan java kodunu yaziniz.

package week1_syso;

import java.util.Scanner;

public class syso_HW6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("Üçüncü sayiyi giriniz: ");
        int sayi3 = scan.nextInt();
        System.out.println("Dördüncü sayiyi giriniz: ");
        int sayi4 = scan.nextInt();
        System.out.println("Besinci sayiyi giriniz: ");
        int sayi5 = scan.nextInt();
        
        int toplam=sayi1+sayi2+sayi3+sayi4+sayi5;
        double ortalama=toplam/5.0;
        System.out.println("Sayilarin Ortalamasi: "+ortalama);
        
        scan.close();
        
    }
}
  
	


