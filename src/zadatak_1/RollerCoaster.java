package zadatak_1;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unosite neku recenicu");
		String unos=input.nextLine();
		input.close();
		String resultString="";
		boolean bool=true;

		for (int i = 0; i < unos.length(); i++) {
			if (!(Character.isAlphabetic(unos.charAt(i)))) {
				resultString+=unos.charAt(i);
			} 
			else if (bool) {
				bool = false;
				resultString+=Character.toUpperCase(unos.charAt(i));
			} 
			else if (!(bool)) {
				bool=true;
				resultString+=Character.toLowerCase(unos.charAt(i));
			}
		}

		System.out.println(resultString);

	}

}
