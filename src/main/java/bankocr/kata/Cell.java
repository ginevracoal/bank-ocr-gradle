package bankocr.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cell {

    public static final int DEFAULT_WIDTH = 3;
    public static final int DEFAULT_HEIGHT = 3;
    private static final Map<String,Integer> numberMap = new HashMap<String,Integer>(){{
        put(    " _ "+
                "| |"+
                "|_|",0);
        put(    "   "+
                "  |"+
                "  |",1);
        put(    " _ "+
                " _|"+
                "|_ ",2);
        put(    " _ "+
                " _|"+
                " _|",3);
        put(    "   "+
                "|_|"+
                "  |",4);
        put(    " _ "+
                "|_ "+
                " _|",5);
        put(    " _ "+
                "|_ "+
                "|_|",6);
        put(    " _ "+
                "  |"+
                "  |",7);
        put(    " _ "+
                "|_|"+
                "|_|",8);
        put(    " _ "+
                "|_|"+
                " _|",9);
    }};
    
    
    private int value;


    public Cell(String stringNumber) {
        value = numberMap.get(stringNumber);
    }

    // TODO: remove toInt
    public Integer toInt() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return value == cell.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public String toString() {
        return toInt().toString();
    }
}
