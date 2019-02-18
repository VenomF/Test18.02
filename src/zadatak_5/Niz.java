package zadatak_5;

import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {
		System.out.println("Unesite pet cijelih brojeva.");
		int[] arr=new int[5];
		Scanner input=new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Unesite " + (i+1) + ". broj.");
			arr[i]=input.nextInt();
		}
		
		System.out.println("Unesite neki cijeli broj 'x'.");
		int x=input.nextInt();
		input.close();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]+arr[j]==x)
					System.out.println(arr[i] + " + " + arr[j] + " = " + x);
			}
		}

	}

}
