package textAnalyzer;

public class TextCounter {

    private int charCount = 0;
    private int lineCount = 0;
    private int wordCount = 0;
    private String wordLength = "";

    public void textCounter(String text) {
        charCount += text.length();
        lineCount++;
        String[] words = text.split(" ");
        wordCount += words.length;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > wordLength.length()) {
                wordLength = words[i];
            }
        }
    }


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
}




