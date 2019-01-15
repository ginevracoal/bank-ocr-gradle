package test.bankocr;

import bankocr.kata.CustomStringReader;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ReadFileTests {

    private static CustomStringReader reader = new CustomStringReader();

    private String[] getStringDigitsFromResource(String resourceName){
        String fileName = BankOcrAcceptanceTest.class.getClassLoader().getResource(resourceName).getFile();
        return reader.readFile(fileName);
    }


    @Test
    public void fileContentAllZeros() throws FileNotFoundException, IOException {
        String[] fileContent = getStringDigitsFromResource("allZerosEntry");

        assertThat(fileContent[0], is(equalTo( " _ " +
                                                      "| |" +
                                                      "|_|")));

    }

    @Test(expected = NullPointerException.class)
    public void fileContentNotFound() throws NullPointerException, FileNotFoundException, IOException {

        String[] fileContent = getStringDigitsFromResource("CosiAcaso");

    }


    @Test
    public void fileContentAllNineZeros() throws FileNotFoundException, IOException {

        String [] testArray = new String[9];

        for( int i = 0; i<9; i++)
            testArray[i] =  " _ " +
                            "| |" +
                            "|_|";

        String[] fileContent = getStringDigitsFromResource("allZerosEntry");

        assertArrayEquals(testArray, fileContent);

    }

    @Test
    public void fileContentAllNineOnes() throws FileNotFoundException, IOException {

        String [] testArray = new String[9];

        for( int i = 0; i<9; i++)
            testArray[i] =  "   " +
                            "  |" +
                            "  |";

        String[] fileContent = getStringDigitsFromResource("allOnesEntry");

        assertArrayEquals(testArray, fileContent);

    }



}
