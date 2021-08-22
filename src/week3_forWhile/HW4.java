//Soru : Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

package week3_forWhile;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        for(int i = 1; i<= sayi; i++){
            faktoriyel = faktoriyel * i;
        }
         
        System.out.println(faktoriyel);
        scan.close();
    }
	
	
	}

