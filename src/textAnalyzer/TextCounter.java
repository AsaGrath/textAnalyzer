package textAnalyzer;

public class TextCounter {

    //När användare skriver stop ska den räkna antal tecken och rader

    private int charCount = 0;
    private int lineCount = 0;

    public void textCounter(String text) {
        charCount += text.length();
        lineCount++;

    }

    public int getCharCount() {
        return charCount;

    }

    public int getLineCount() {
        return lineCount;
    }

}


