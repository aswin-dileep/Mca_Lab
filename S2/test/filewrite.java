import java.io.*;
import java.util.Scanner;

public class filewrite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = "sample.txt";
        
        System.out.println("Enter the number of lines to write:");
        int n = s.nextInt();
        s.nextLine(); // consume the leftover newline

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter the line to write:");
                String line = s.nextLine();
                writer.write(line);
                writer.newLine();
                System.out.println("Text has been written");
            }
        } catch (IOException e) {
            System.out.println("Error Writing");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File Not Found");
        }

        s.close(); // close the Scanner
    }
}
