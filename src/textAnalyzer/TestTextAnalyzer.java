package textAnalyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTextAnalyzer {


    @Test
    public void testCharCount() {

        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.textCounter("hej, jag heter Åsa");

        //Assert
        assertEquals(18, counter.getCharCount());

    }

    @Test
    public void testLineCount() {

        TextCounter counter = new TextCounter();

        counter.textCounter("hej");
        counter.textCounter("på");
        counter.textCounter("dig");
        counter.textCounter("!");

        assertEquals(4, counter.getLineCount());

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

        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");
        counter.textCounter("Hej! Det här är en lång text som testar både STORA och små bokstäver.");


        assertEquals(12, counter.getLineCount());

    }


    //Räkna tecken
    //Räkna rader
    //Specialtecken
    //Lämna tomt
    //kort test
    //långt test
    // bara mellanslag ?
}
