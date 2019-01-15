package test.bankocr;

import bankocr.kata.Cell;
import bankocr.kata.StringParser;
import org.junit.Test;

import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CellTest {



    static private String[] allNums = new String[] {
            " _ "+
                    "| |"+
                    "|_|",
            "  |"+
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


    @Test
    public void zeroCell()  {
        Cell cell = new Cell(allNums[0]);

        assertThat(cell.toInt(), is(equalTo(0)));

    }
}
