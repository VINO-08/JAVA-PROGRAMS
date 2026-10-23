import java.io.*;

public class Experiment14 {
    public static void main(String[] args) {

        String fileName = "student.txt";

        try {
            // Writing data to the file
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: 101");
            bw.newLine();

            bw.write("Name: Arun");
            bw.newLine();

            bw.write("Department: CSE");
            bw.newLine();

            bw.write("CGPA: 8.5");

            bw.close();

            System.out.println("Data written successfully.");

            // Reading data from the file
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Student Details:");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}