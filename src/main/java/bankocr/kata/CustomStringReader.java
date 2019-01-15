package bankocr.kata;

import java.io.*;

public class CustomStringReader {


    public String[] readFile(String path){

        String [] rowAccount = new String[9];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));

            String line;



            int j = 0;

            while( (line = reader.readLine()) != null ){

                for( int i=0; i<9; ++i ){
                    if( j == 0 )
                        rowAccount[i] = line.substring(i*3, (i+1)*3);
                    else
                        rowAccount[i] += line.substring(i*3, (i+1)*3);

                }
                j++;
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
