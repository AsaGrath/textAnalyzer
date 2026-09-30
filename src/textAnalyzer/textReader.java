package textAnalyzer;

import java.util.Scanner;

public class textReader {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String input = "";
        int charCount = 0;
        int lineCount = 0;


        //Läs in text från consolen tills användaren skriver stop
        System.out.println("skriv din text här. Skriv stop för att avsluta ");
        while (!input.equals("stop")) {
            input = scan.nextLine();


            //När användare skriver stop ska den räkna antal tecken och rader
            if (!input.equals("stop")) {
                charCount += input.length();
                lineCount++;

            }
        }
        System.out.println(charCount);
        System.out.println(lineCount);

    }

}

