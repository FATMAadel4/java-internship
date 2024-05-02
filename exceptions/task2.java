import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  Main { 
    public static void main(String[] args) {
        int Count = 0; 
        try (FileReader read  = new FileReader("C:\\Users\\NanoChip\\Lincoln.txt")){
            
            BufferedReader br = new BufferedReader(read);
            String words;
            while ((words = br.readLine()) != null) {
                 String[] array=  words.split(" ");
                 Count +=  array.length;
            }

            System.out.println(Count);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
