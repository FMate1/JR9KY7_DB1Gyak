package DBgyak_2;

import java.io.*;
import java.util.*;

public class FMFileIr {

	public static void main(String[] args) throws IOException {
		
		int adatdb= 0;
		System.out.println("Adja meg hany db adatot szeretne megadni a txt-be. \n");
		Scanner sc = new Scanner(System.in);
	    adatdb = sc.nextInt();
	    
	    ArrayList <Integer> adatok = new ArrayList<Integer>();
		
	    System.out.println("Adja meg a beolvasando adatokat! \n");
	    for (int i = 0; i < adatdb; i++) {
	    	
	    	adatok.add(sc.nextInt());
		}
	    File file = new File("adatok.txt");
	    
        if (!file.exists()) {
        	
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < adatok.size(); i++) {
        	
            bw.write(adatok.get(i).toString());
        }
        bw.flush();
        bw.close();
        
        System.out.println("Az adatok masolasa megtortent.");
	    
	}

}
