package bankocr.kata;

public class Main {
    public static void main(String... args) {

        CustomStringReader reader = new CustomStringReader();
        String[] readFile = reader.readFile(args[0]);
        StringParser parser = new StringParser();
        System.out.println(parser.parseArray(readFile));
    }
}
