package test.bankocr;

import bankocr.kata.Cell;
import bankocr.kata.Entry;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


public class EntryTest {


    @Test
    public void entryAllOnes(){
        String[] rowsAllOnes = {
                        "                           ",
                        "  |  |  |  |  |  |  |  |  |" ,
                        "  |  |  |  |  |  |  |  |  |"
        };
        Entry entry = new Entry(rowsAllOnes);
        Cell[] arrayCellAllOnes = new Cell[9];
        Arrays.fill(arrayCellAllOnes, new Cell("   " +
                                                            "  |" +
                                                            "  |"));

        assertThat(entry.getCells(), is(equalTo(arrayCellAllOnes)));

    }
}
