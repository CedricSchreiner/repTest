/*
 * Dieses kleine Java-Programm erzeugt ein sehr einfaches
 * Konsolen-Menü und dient dazu die Arbeitsweise eines RCS
 * zu erklären.
 * Autor(en): Michael Sauer
 * Datum:     03.01.2014
 * Datum:     28.11.2014 //fuer Veraenderung zu demonstrieren
 * Compile:   javac menue.java
 * Execute:   java menu
 */

import java.util.Scanner;
import java.util.InputMismatchException;

private static final int PROGRAMMENDE=0;
private static final int MICHAEL_SAUER=1; 
private static final int MIKE_SOUR=2;
private static final int MATHIAS_W=3;
private static final int BANENE=4;
public class menue{
        public static void main(String[] args) {
        	
        	boolean isEnde=false;

        	String[] textfeld={"Ciao",
                                "Michael Sauer",
                                "Mike Sour",
				"Mathias W."};
		
		Scanner scanner = new Scanner(System.in);
        	while(!isEnde){
			try{
				int wahl = scanner.nextInt();
				switch (wahl) {
					case PROGRAMMENDE:
						System.out.println(textfeld[0]);
						isEnde=true;
					break;
					case MICHAEL_SAUER:
						System.out.println("Michael Sauer");
					break;
					case MIKE_SOUR:
						System.out.println("Mike Sour");
					break;
					case MATHIAS_W:
						System.out.println("Mathias Wittling");
					break;
					case BANANE:
						System.out.println("Mac ist zu umständlich!");
					break;
					default:
						System.out.println("Fehler: Kenne ich nicht!");
					}
			}catch(IllegalArgumentException e){
				System.err.println(e + "Ein Fehler ist aufgetreten.");
			}catch(InputMismatchException e){
				System.err.println(e + "Fehlerhafte Eingabe");
                	}
        	}
	}

