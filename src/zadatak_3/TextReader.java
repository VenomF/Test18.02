package zadatak_3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TextReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Unesite ime filea.");
		Scanner input=new Scanner(System.in);
		String fileName=input.next();
		System.out.println("Da li zelite da ispisete:\n1)Sve rijeci ukljucujuci duplikate,\n2)Samo unikatne rijeci");
		boolean choice=input.nextBoolean();
		List list;
		input.close();
		
		if(choice) {
			list=new ArrayList<String>();
		}else {
			list=new LinkedList<String>();
		}
		
		File file=new File(fileName);
		Scanner reader=new Scanner(file);
		while(reader.hasNext())
			list.add(reader.next());
		
		Collections.sort(list, null);
	}

}
