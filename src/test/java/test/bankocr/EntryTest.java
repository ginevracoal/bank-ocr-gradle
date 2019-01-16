package test.bankocr;

import bankocr.kata.Cell;
import bankocr.kata.Entry;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class EntryTest {

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

    @Test
    public void entryAllOnes(){
        String[] rowsAllOnes = {
                        "                           ",
                        "  |  |  |  |  |  |  |  |  |",
                        "  |  |  |  |  |  |  |  |  |"
        };
        Entry entry = new Entry(rowsAllOnes);
        Cell[] arrayCellAllOnes = new Cell[9];
        Arrays.fill(arrayCellAllOnes, new Cell("   " +
                                                           "  |" +
                                                           "  |"));

        assertThat(entry.getCells(), is(equalTo(arrayCellAllOnes)));
    }


    @Test
    public void readZeros()  {
        String [] zeros = {
                " _ ".repeat(9),
                "| |".repeat(9),
                "|_|".repeat(9)};
        Entry myentry = new Entry(zeros);
        assertThat(myentry.toString(),is(equalTo("0".repeat(9))));
    }
/*
    @Test
    public void readNAll()  {
        StringParser parser = new StringParser();


        assertThat(parser.parseArray(allNums),is(equalTo("0123456789")));

    }*/

}
