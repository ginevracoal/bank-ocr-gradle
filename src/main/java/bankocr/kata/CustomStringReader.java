package bankocr.kata;

import java.io.*;
import java.util.Arrays;

public class CustomStringReader {


    public String[] readFile(String path){
        String[] rowAccount = new String[Entry.DEFAULT_LENGTH];
        Arrays.fill(rowAccount, "");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));

            String line;

            //while a non-empty line is found, try getting string representation
            //of numbers out of lines
            while( (line = reader.readLine()) != null ){

                for(int i=0; i < Entry.DEFAULT_LENGTH; ++i){
                    rowAccount[i] += line.substring(i * Cell.DEFAULT_WIDTH,
                                                    (i + 1) * Cell.DEFAULT_WIDTH);
                }
            }
            reader.close();

        }catch (FileNotFoundException e) {
            System.out.println("File " + path + " not found;");
        } catch (IOException e) {
            System.out.println("IO exception");
        }

        return rowAccount;
    }
}
