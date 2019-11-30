package net.umutozkanaryali;

public class Main {

	public static void main(String[] args) {
	 	
		RomanRakami(2000);
	}
	
	
	
	
	
	
	
	
	
	
	public static int RomanRakami(int sayi) {
		if(sayi <1 || sayi > 3999 ) {
			System.out.println("Hatalı Sayı Girdiniz. Lütfen 1 ile 3999 arasında bir sayı seçiniz");
			return sayi;
		}else {
			String s = "";
		    while (sayi >= 1000) {
		        s += "M";
		        sayi -= 1000;
		        System.out.println(s);
		        }
		    while (sayi >= 900) {
		        s += "CM";
		        sayi -= 900;
		        System.out.println(s);
		    }
		    while (sayi >= 500) {
		        s += "D";
		        sayi -= 500;
		        System.out.println(s);
		    }
		    while (sayi >= 400) {
		        s += "CD";
		        sayi -= 400;
		        System.out.println(s);
		    }
		    while (sayi >= 100) {
		        s += "C";
		        sayi -= 100;
		        System.out.println(s);
		    }
		    while (sayi >= 90) {
		        s += "XC";
		        sayi -= 90;
		        System.out.println(s);
		    }
		    while (sayi >= 50) {
		        s += "L";
		        sayi -= 50;
		        System.out.println(s);
		    }
		    while (sayi >= 40) {
		        s += "XL";
		        sayi -= 40;
		        System.out.println(s);
		    }
		    while (sayi >= 10) {
		        s += "X";
		        sayi -= 10;
		        System.out.println(s);
		    }
		    while (sayi >= 9) {
		        s += "IX";
		        sayi -= 9;
		        System.out.println(s);
		    }
		    while (sayi >= 5) {
		        s += "V";
		        sayi -= 5;
		        System.out.println(s);
		    }
		    while (sayi >= 4) {
		        s += "IV";
		        sayi -= 4;
		        System.out.println(s);
		    }
		    while (sayi >= 1) {
		        s += "I";
		        sayi -= 1;
		        System.out.println(s);
		    }    
		    return sayi;
		}
		}
	}
	
	
