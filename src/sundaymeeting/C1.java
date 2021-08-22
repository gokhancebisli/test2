//Soru:Ücüncü bir degisken kullanarak iki degiskenin degerlerini degistirin. 

package sundaymeeting;

public class C1 {

	public static void main(String[] args) {
		int a = 10;
        int b = 5;
        int c;
        System.out.println("a :" + a + " b :" + b);
        c=a;
        a=b;
        b=c;
        System.out.println("Degiskenlerin yeni degeri... \n"+ "a :" + a + " b :" + b);
	}

}
