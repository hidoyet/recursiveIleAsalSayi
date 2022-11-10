package recursiveIleAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Asal olup olmadığını kontrol etmek istediğiniz sayıyı giriniz: ");
		int num=scanner.nextInt();
		System.out.println(isPrime(num));
		if(isPrime(num)==true) {
			System.out.println(num+" sayısı asaldır.");
		}else {
			System.out.println(num+" sayısı asal değildir.");
		}
	}
	static boolean isPrime(int num) {
		
		int control=1;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				control++;
				isPrime(num-1);
				if(control>1)
					return false;
			}
		}
		return true;
		
	}

}
