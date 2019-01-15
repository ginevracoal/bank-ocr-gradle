package bankocr.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringParser {

    private static final Map<String,Integer> numberMap = new HashMap<String,Integer>(){{
        put(    " _ "+
                "| |"+
                "|_|",0);
        put(    "  |"+
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


    public Integer parse(String stringNumber){

        return numberMap.get(stringNumber);
    }


    public String parseArray(String[] arrayStrings){
        return Arrays.stream(arrayStrings).map(x -> parse(x).toString()).reduce("",String::concat);
    }
}
