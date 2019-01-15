package test.bankocr;

import bankocr.kata.CustomStringReader;
import org.junit.Test;

import java.lang.NullPointerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BankOcrAcceptanceTest {

    private static CustomStringReader reader = new CustomStringReader();

    private URL getResource(String resourceName){
        return BankOcrAcceptanceTest.class.getClassLoader().getResource(resourceName);
    }

    @Test
    public void parseFileWithSingleAllZeroEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allZerosSingleEntry = getResource("allZerosEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(allZerosSingleEntry);

        application.showsAccountNumber("000000000\n");
    }

    @Test
    public void readFileAllZeros() throws FileNotFoundException, IOException {
        URL allZerosSingleEntry = getResource("allZerosEntry");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

        assertThat(readFile[0], is(equalTo(" _ | ||_|")));

    }

    @Test(expected = NullPointerException.class)
    public void readFileNotFound() throws NullPointerException, FileNotFoundException, IOException {

        URL allZerosSingleEntry = getResource("CosiAcaso");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

    }


    @Test
    public void readFileAllNineZeros() throws FileNotFoundException, IOException {

        String [] testArray = new String[9];

        for( int i = 0; i<9; i++)
            testArray[i] = " _ | ||_|";

        URL allZerosSingleEntry = getResource("allZerosEntry");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

        assertArrayEquals(testArray, readFile);

    }

    @Test
    public void readFileAllNineOnes() throws FileNotFoundException, IOException {

        String [] testArray = new String[9];

        for( int i = 0; i<9; i++)
            testArray[i] = "     |  |";

        URL allZerosSingleEntry = getResource("allOnesEntry");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

        assertArrayEquals(testArray, readFile);

    }


//    @Test
//    public void readFileWithParameters() throws FileNotFoundException, IOException {
//

//    }
}
