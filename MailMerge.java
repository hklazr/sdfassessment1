package task01.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class MailMerge {
  
  
        public static void main(String[] args) {
    
            try {
                    // Create reader objects for CSV and text file template
                BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\src\\task01\\src\\thankyou.csv"));
                BufferedReader templateReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\src\\task01\\src\\thankyou.txt"));
      
    
                FileWriter writer = new FileWriter("C:\\Users\\Admin\\src\\task01\\src\\thankyou2.txt");
      
                    // Read each line of CSV
            String csvLine;
            while ((csvLine = csvReader.readLine()) != null) {
        
                    // StringTokenizer to parse the line into values
                StringTokenizer token = new StringTokenizer(csvLine, ",");
        
                    
            String templateLine;
            while ((templateLine = templateReader.readLine()) != null) {
                    
                    // Write the template line to the output file, replacing placeholders with values CSV
                templateLine = templateLine.replace("<<address>>", token.nextToken());
                templateLine = templateLine.replace("<<first_name>>", token.nextToken());
                templateLine = templateLine.replace("<<years>>", token.nextToken());
                writer.write(templateLine);
        }
        
                templateReader.close();
                templateReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\src\\task01\\src\\thankyou2.txt"));
      }
                    // Close the readers and writer
                csvReader.close();
                templateReader.close();
    
    } catch(IOException e) {           
      

   }
}
}