package textAnalyzer;

public class TextCounter {

    //Attribut
    private int charCount;
    private int lineCount;
    private int wordCount;
    private String wordLength;

    //Konstruktor med startvärden
    public TextCounter() {
        this.charCount = 0;
        this.lineCount = 0;
        this.wordCount = 0;
        this.wordLength = "";
    }

    //Räknaren som håller koll och sparar in
    public void textCounter(String text) {
        charCount += text.length();
        lineCount++;

        //Delar texten i mellanslag för att räkna ord
        String[] words = text.split(" ");
        wordCount += words.length;

        //Loop som går igenom min inlästa text. Jämför ordlängd och ersätter med det längsta ordet
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > wordLength.length()) {
                wordLength = words[i];
            }
        }
    }

    //Metoderna som returnerar värden
    public int getCharCount() {
        return charCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getWordLength() {
        return wordLength;
    }

    //Kontroll för stop
    public boolean isRunning(String text) {
        if (!text.equals("stop")) {
            return true;
        } else {
            return false;
        }
    }
}






