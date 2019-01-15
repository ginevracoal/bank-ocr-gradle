package bankocr.kata;

import java.util.Arrays;

public class Entry {

    private Cell[] entry;

    public Entry(String[] rows) {}

    public String toString() {
        Cell zeroCell = new Cell(
                " _ "+
                            "| |"+
                            "|_|");
                Cell[] entry = {zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell};
        return Arrays.stream(entry).map(Cell::toString).reduce("", String::concat);
    }

}
