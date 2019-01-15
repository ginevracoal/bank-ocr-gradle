package test.bankocr;

import bankocr.kata.StringParser;
import org.junit.Test;

import java.lang.reflect.Array;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ParsingTest {




    static private String[] allNums = new String[] {
                    " _ "+
                    "| |"+
                    "|_|",
                    "   "+
                    "  |"+
                    "  |",
                    " _ "+
                    " _|"+
                    "|_ ",
                    " _ "+
                    " _|"+
                    " _|",
                    "   "+
                    "|_|"+
                    "  |",
                    " _ "+
                    "|_ "+
                    " _|",
                    " _ "+
                    "|_ "+
                    "|_|",
                    " _ "+
                    "  |"+
                    "  |",
                    " _ "+
                    "|_|"+
                    "|_|",
                    " _ "+
                    "|_|"+
                    " _|"
    };

    static private String strZero = allNums[0];

    @Test
    public void readZero()  {
        StringParser parser = new StringParser();
        assertThat(parser.parse(strZero),is(equalTo(0)));

    }

    @Test
    public void readZeros()  {
        StringParser parser = new StringParser();
        String [] zeros = {strZero,strZero};
        assertThat(parser.parseArray(zeros),is(equalTo("00")));

    }

    @Test
    public void readNAll()  {
        StringParser parser = new StringParser();


        assertThat(parser.parseArray(allNums),is(equalTo("0123456789")));

    }


}
