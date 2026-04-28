import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Fuck me hard.");
        writer.write("\nPlease don't stop");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
