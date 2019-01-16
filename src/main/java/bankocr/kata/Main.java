package bankocr.kata;

public class Main {
    public static void main(String... args) {

        EntryReader reader = new EntryReader();
        String[] readFile = reader.readFile(args[0]);
        StringParser parser = new StringParser();
        System.out.println(parser.parseArray(readFile));
    }
}
