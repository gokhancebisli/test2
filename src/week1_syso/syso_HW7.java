//Soru : Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)


package week1_syso;

import java.util.Scanner;

public class syso_HW7 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
        
        int sayi1,sayi2;
        int gecici;
        
        System.out.print("1. Sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        sayi2 = scan.nextInt();
        
        System.out.println("Degerler degistiriliyor...");
        
        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        
        System.out.println("1. Sayi = " + sayi1);
        System.out.println("2. Sayi = " + sayi2);
        
        scan.close();
        
    }
}

