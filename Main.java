package recursiveIleAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Asal olup olmad���n� kontrol etmek istedi�iniz say�y� giriniz: ");
		int num=scanner.nextInt();
		System.out.println(asal(num));
		if(asal(num)==true) {
			System.out.println(num+" say�s� asald�r.");
		}else {
			System.out.println(num+" say�s� asal de�ildir.");
		}
	}
	static boolean asal(int num) {
		
		int control=1;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				control++;
				asal(num-1);
				if(control>1)
					return false;
			}
		}
		return true;
		
	}

}
