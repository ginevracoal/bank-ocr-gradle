package test.bankocr;

import bankocr.kata.StringParser;
import org.junit.Test;

import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class parsingTests {


    @Test
    public void readZero()  {
        StringParser parser = new StringParser();
        assertThat(parser.parse(" _ "+
                                "| |"+
                                "|_|"),is(equalTo(0)));

    }
}
