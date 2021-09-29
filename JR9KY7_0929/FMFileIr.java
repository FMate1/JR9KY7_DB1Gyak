package DBgyak_2;

import java.io.*;
import java.util.*;

public class FMFileIr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Adja meg mennyi adatot szeretne iratni a txt-be (egesz szam): \n");
		
		Scanner in = new Scanner(System.in);
		int adatokDB = in.nextInt();
		List adatok = new ArrayList();
		
		for (int i = 0; i < adatokDB; i++) {
			System.out.println("Adja meg a(z)" + i+1 + ". darabot (egesz szam): \n");
			adatok.add(in.nextInt());
		}
		
		//File f = new File(kiirt.txt);

	}

}
