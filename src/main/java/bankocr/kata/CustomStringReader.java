package bankocr.kata;

import java.io.*;
import java.util.Arrays;

public class CustomStringReader {


    public String[] readFile(String path){
        String[] rowAccount = new String[9];
        Arrays.fill(rowAccount, "");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));

            String line;



            //while a non-empty line is found, try getting string representation
            //of numbers out of lines
            while( (line = reader.readLine()) != null ){
                //TODO replace magic numbers
                for( int i=0; i<9; ++i ){
                    rowAccount[i] += line.substring(i*3, (i+1)*3);
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
