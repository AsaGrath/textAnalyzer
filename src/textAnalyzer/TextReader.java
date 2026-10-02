package textAnalyzer;

import java.util.Scanner;

public class TextReader {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TextCounter counter = new TextCounter();


        String text = "";

        //Läs in text från consolen tills användaren skriver stop
        System.out.println("skriv din text här. Skriv stop för att avsluta ");
        while (!text.equals("stop")) {
            text = scan.nextLine();


            //När användare skriver stop ska den räkna antal tecken och rader.
            // Om text inte är stop räkna. Vid stop slutar den räkna
            if (!text.equals("stop")) {
                counter.textCounter(text);

            }
        }
        System.out.println("Antal tecken: " + counter.getCharCount());
        System.out.println("Antal rader: " + counter.getLineCount());

    }

}