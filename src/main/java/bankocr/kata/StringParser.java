package bankocr.kata;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringParser {

    public Integer parse(String stringNumber){
        Map<String,Integer> numberMap = new HashMap<String,Integer>(){{
            put(" _ "+
                "| |"+
                "|_|",0);
        }};
        return numberMap.get(stringNumber);
    }


    public String parseArray(String[] arrayStrings){
        return Arrays.stream(arrayStrings).map(x -> parse(x).toString()).reduce("",String::concat);
    }
}
