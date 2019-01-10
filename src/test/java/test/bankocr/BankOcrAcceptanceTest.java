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

    @Test
    public void parseFileWithSingleAllZeroEntryAndShowActualAccountNumberOnConsole() throws Exception {
        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");
        ApplicationRunner application = new ApplicationRunner();

        application.parseFile(allZerosSingleEntry);

        application.showsAccountNumber("000000000\n");
    }

    @Test
    public void readFileAllZeros() throws FileNotFoundException, IOException {
        CustomStringReader reader = new CustomStringReader();

        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

        assertThat(readFile[0], is(equalTo(" _ | ||_|")));

    }

    @Test(expected = NullPointerException.class)
    public void readFileNotFound() throws NullPointerException, FileNotFoundException, IOException {
        CustomStringReader reader = new CustomStringReader();

        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("Domajoi CaccaMerda");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

    }


    @Test
    public void readFileAllNineZeros() throws FileNotFoundException, IOException {

        String [] testArray = new String[9];

        for( int i = 0; i<9; i++)
            testArray[i] = " _ | ||_|";

        CustomStringReader reader = new CustomStringReader();

        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allZerosEntry");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

        assertArrayEquals(testArray, readFile);

    }

    @Test
    public void readFileAllNineOnes() throws FileNotFoundException, IOException {

        String [] testArray = new String[9];

        for( int i = 0; i<9; i++)
            testArray[i] = "     |  |";

        CustomStringReader reader = new CustomStringReader();

        URL allZerosSingleEntry = BankOcrAcceptanceTest.class.getClassLoader().getResource("allOnesEntry");

        String[] readFile = reader.readFile(allZerosSingleEntry.getFile());

        assertArrayEquals(testArray, readFile);

    }
}
