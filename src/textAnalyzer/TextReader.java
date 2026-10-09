package textAnalyzer;

import java.util.Scanner;

public class TextReader {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        TextCounter counter = new TextCounter();

        //Läs in text från console. Loopen körs till användaren skriver stop
        System.out.println("skriv din text här. Skriv stop för att avsluta ");
        while (true) {
            String text = scan.nextLine();

            if (!counter.isRunning(text)) {
                break;
            } else {
                counter.textCounter(text);
            }

        }
        //Skriv ut allt som räknats
        System.out.println("Antal tecken: " + counter.getCharCount());
        System.out.println("Antal rader: " + counter.getLineCount());
        System.out.println("Antal ord: " + counter.getWordCount());
        System.out.println("Längsta ordet: " + counter.getWordLength());

    }
}


