package javaCsvReadAndInput;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class CsvRead {


    public static void main(String[] args) throws IOException {
        dbInput d = new dbInput();
        dbFilter x = new dbFilter();
        String IFSC = new String();
        Scanner sc = new Scanner(System.in);
        String fileName = "DataSources/IFSCdata - Sheet1.csv";
        try( CSVReader reader = new CSVReader(new FileReader(fileName),',','"',1)){
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null){
                if (nextLine != null){
                    //System.out.println(Arrays.toString(nextLine));
                    //System.out.println(nextLine[3]);
                    d.dbin(nextLine);

                }
            }
        }
        System.out.println("Enter the IFSC code to search");
        IFSC = sc.next();
        x.dbfil(IFSC);

    }
}
