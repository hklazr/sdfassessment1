package task01.src;

 import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.PrintWriter;
  
  public class CsvReader {
    public static void main(String[] args) {
      String csvFile = "C:\\Users\\Admin\\src\\task01\\src\\thankyou.csv";
      String textFile = "C:\\Users\\Admin\\src\\task01\\src\\thankyou2.txt";
      String line = "";
      String csvSplitBy = ",";
  
      try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
           PrintWriter pw = new PrintWriter(textFile)) {
  
        // Read the CSV file line by line
        while ((line = br.readLine()) != null) {
          // Split the line into fields
          String[] fields = line.split(csvSplitBy);
  
          // Write the fields to the text file
          for (String field : fields) {
            pw.println(field);
          }
        }
  
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
  
    

