package test.bankocr;

import bankocr.kata.Entry;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationTest {

    @Test
    public void validationZerosMod11() {

        String[] zeros = {
                " _ ".repeat(9),
                "| |".repeat(9),
                "|_|".repeat(9)};
        Entry zerosEntry = new Entry(zeros);

        assertTrue(zerosEntry.validate());

    }

    @Test
    public void validationInvalidMod11() {

        String[] ones = {
                "   ".repeat(9),
                "  |".repeat(9),
                "  |".repeat(9)};
        Entry onesEntry = new Entry(ones);

        assertFalse(onesEntry.validate());

    }

    @Test
    public void validationRealisticMod11() {

        String[] realisticString = {
                "    _  _     _  _  _  _  _ ",
                "  | _| _||_||_ |_   ||_||_|",
                "  ||_  _|  | _||_|  ||_| _|"
        };
        Entry realisticEntry = new Entry(realisticString);

        assertTrue(realisticEntry.validate());

    }
}
