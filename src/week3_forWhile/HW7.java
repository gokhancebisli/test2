/*Soru : Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, 
herhangi bir sayı Mükemmel Sayı olarak bilinir.
*/

package week3_forWhile;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");

	}
        scan.close();
	}
}
