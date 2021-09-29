package DBgyak_2;

import java.io.*;

public class FMFileOlvasas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "fekete.txt";

	    try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName));) {
	      int sum = 0;

	      while (true) {
	        String lineRead = fileReader.readLine();
	        if (lineRead == null) {
	          break;
	        }
	        int num = Integer.parseInt(lineRead);
	        sum += num;
	      }

	      System.out.println("Az osszeg: " + sum);
	      System.out.println("A beolvasott file neve: " + fileName);
	    }

	    catch (IOException ioex) {
	      System.err.println("Error");
	    }
	  }

	}

