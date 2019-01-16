package test.bankocr;

import bankocr.kata.Entry;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ValidationTest {

    @Test
    public void validationZerosMod11(){

        String [] zeros = {
                " _ ".repeat(9),
                "| |".repeat(9),
                "|_|".repeat(9)};
        Entry zerosEntry = new Entry(zeros);

        assertTrue(zerosEntry.validate());

    }
}
