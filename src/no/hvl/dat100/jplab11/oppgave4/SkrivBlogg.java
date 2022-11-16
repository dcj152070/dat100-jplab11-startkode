package no.hvl.dat100.jplab11.oppgave4;

// oppg4)

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static String MAPPE = System.getProperty
			("user.dir") + 
			"/src/no/hvl/dat100/jplab11/tests/";
	
	public static boolean skriv(Blogg samling, String mappe,  String filnavn) {
		PrintWriter skriver;
		try {		
			skriver = new PrintWriter(MAPPE + filnavn);
			
		} catch (FileNotFoundException e) {
			return true;
			
		}
		String tekst = samling.toString();
		skriver.print(tekst);
		
		skriver.close();
		return false;
	}
	
}
