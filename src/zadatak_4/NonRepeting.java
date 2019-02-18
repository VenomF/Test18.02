package zadatak_4;

import java.util.Scanner;

public class NonRepeting {

	public static void main(String[] args) {
		System.out.println("Unesite neku recenicu.");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		char nonRepeting=str.charAt(0);
		char result='a';
		
		for(int i=str.length()-1; i>=0; i--) {
			nonRepeting=str.charAt(i);
			for(int j=0; j<str.length(); j++)
				if(str.charAt(j)==nonRepeting)
					break;
				else
					result=nonRepeting;
		}

System.out.println(result);
	}

}
