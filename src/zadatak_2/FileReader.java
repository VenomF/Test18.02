package zadatak_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Unesite ime filea.");
		Scanner input=new Scanner(System.in);
		String fileName=input.next();
		File file=new File(fileName);
		input.close();

		if(file.exists()) {
			int wordsCounter=0;
			int vowelsCounter=0;
			int consonantCounter=0;

			Scanner reader=new Scanner(file);

			while(reader.hasNext()) {
				wordsCounter++;
				String word=reader.next();

				for(int i=0; i<word.length(); i++) {
					char ch=word.charAt(i);

					if(Character.isAlphabetic(ch)) {
						switch (ch) {
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
							vowelsCounter++;
							break;
						default:consonantCounter++;

						}
					}

				}
			}

			System.out.println("Broj rijeci u fileu je " + wordsCounter);
			System.out.println("Broj samoglasnika u fileu je " + vowelsCounter);
			System.out.println("Broj suglasnika u fileu je " + consonantCounter);
			
			reader.close();
		}else {
			file.createNewFile();
		}

	}

}
