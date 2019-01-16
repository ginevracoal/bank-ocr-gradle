package bankocr.kata;

public class Entry {

    private Cell[] entry;

    public Entry(String[] rows) {}

        entry = Arrays.stream(cellString).map(x->new Cell(x))
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

//    public String toString() {
        Cell zeroCell = new Cell(
                " _ "+
                            "| |"+
                            "|_|");
                Cell[] entry = {zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell,zeroCell};
        return Arrays.stream(entry).map(Cell::toString).reduce("", String::concat);
    }

}
