package DB_3gyak;

import java.io.BufferedReader;
import java.io.FileReader;

public class jr9ky7_3_4 {

	public static void main(String[] args) {
		
		String sor;
		String[] szavak;
		int sorid= 0;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("sads"));
			while((sor = br.readLine()) != null)
			{
				System.out.println(sor.toUpperCase());
			}
			br.close();
			System.out.println("A konvert�l�s kesz");
		} catch (Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
