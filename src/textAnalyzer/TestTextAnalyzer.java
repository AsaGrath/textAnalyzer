package textAnalyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTextAnalyzer {


    @Test
    public void testCharCount() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.textCounter("här är min text");

        //Assert
        assertEquals(15, counter.getCharCount());

    }

    @Test
    public void testLineCount() {

        TextCounter counter = new TextCounter();

        counter.textCounter("hej på dig!");

        assertEquals(1, counter.getLineCount());

    }

    @Test
    public void testSpecialCharacter() {

        TextCounter counter = new TextCounter();

        counter.textCounter("!#%&?789--åäö");

        assertEquals(13, counter.getCharCount());

    }

    @Test
    public void testEmptyString() {

        TextCounter counter = new TextCounter();

        counter.textCounter("");

        assertEquals(0, counter.getCharCount());

    }

    @Test
    public void testShortString() {

        TextCounter counter = new TextCounter();

        counter.textCounter("A");

        assertEquals(1, counter.getCharCount());

    }

    @Test
    public void testLongString() {

        TextCounter counter = new TextCounter();

        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver. " +
                "Jag har även valt att lägga in några siffror 345. " +
                "Kanske ska vi lägga in några specialtecken när vi ändå håller på...!?#");

        assertEquals(190, counter.getCharCount());

    }

    @Test
    public void testManyLinesString() {

        TextCounter counter = new TextCounter();

        for (int i = 0; i < 20; i++) {
            counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        }
        assertEquals(20, counter.getLineCount());

    }

    @Test
    public void testWordCount() {

        TextCounter counter = new TextCounter();

        counter.textCounter("Här är min text");

        assertEquals(4, counter.getWordCount());

    }

    @Test
    public void testWordLength() {

        TextCounter counter = new TextCounter();

        counter.textCounter("Här är min längsta text");

        assertEquals("längsta", counter.getWordLength());

    }

    @Test
    public void testIsRunning() {

        TextCounter counter = new TextCounter();

        counter.textCounter("här är min text");

        assertEquals(true, counter.isRunning("här är min text"));

    }
 }
