import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentsFilter {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("studentsEN.txt"));
             FileWriter writer = new FileWriter("studentsGrade5.txt")) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) {
                    continue;
                }
                String[] parts = line.trim().split("\\s+");
                String grade = parts[parts.length - 1];
                if (grade.equals("5")) {
                    writer.write(line + System.lineSeparator());
                }
            }
            System.out.println("Done");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
