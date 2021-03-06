package bankocr.kata;

import java.util.Arrays;

public class Entry {

    private Cell[] entry;
    public static final int DEFAULT_LENGTH = 9;

    public Entry(String[] rows) {
        String[] cellString = new String[9];
        Arrays.fill(cellString, "");

        for (String line:rows) {
            for (int i = 0; i < DEFAULT_LENGTH; ++i) {
                cellString[i] += line.substring(i * Cell.DEFAULT_WIDTH,
                                                (i + 1) * Cell.DEFAULT_WIDTH);
            }
        }

        entry = Arrays.stream(cellString).map(Cell::new)
                                         .toArray(Cell[]::new);
    }

    public Cell[] getCells(){
        return entry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry1 = (Entry) o;
        return Arrays.equals(entry, entry1.entry);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(entry);
    }

    public String toString() {
        return Arrays.stream(entry).map(Cell::toString).reduce("", String::concat);
    }

    public boolean validate(){

        // TODO still have to implement the print for false case
        int dotProduct = 0;
        for(int i = entry.length; i > 0; i--){
            dotProduct += entry[entry.length-i].toInt()*i;
        }
        return dotProduct % 11 == 0;
    }

}
