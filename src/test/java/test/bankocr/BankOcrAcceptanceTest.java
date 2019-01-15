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

}
