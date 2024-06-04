import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        createFile();
        // first read exit file, after add new line, and again read to see change
        fileReader();
        writeFile();
        fileReader();
    }
    public static void createFile() {
        File file = new File("/Users/ulkudurmaz/Desktop/IdeaProjects/Patika/Week-6/files/notlar.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Created file");
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fileReader() {
        File file = new File("/Users/ulkudurmaz/Desktop/IdeaProjects/Patika/Week-6/files/notlar.txt"); // create a file
        // file read with a scanner class
        try {
            Scanner reader = new Scanner(file); // file can be empty that's why add a try catch block
            while(reader.hasNextLine()) {
                String line = reader.nextLine(); //This line reads the next line from the input using the nextLine()
                System.out.println(line); // writed lines
            }
            reader.close(); // for efficiency
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    //
public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/ulkudurmaz/Desktop/IdeaProjects/Patika/Week-6/files/notlar.txt"));
            writer.newLine();
            // Scanner for user input
            Scanner scanner = new Scanner(System.in);
            // Prompt the user for input
            System.out.print("Enter a value: ");
            String userInput = scanner.nextLine();
            // Write the user input to the file
            writer.write(userInput);
            writer.newLine(); // Move to the next line
            // Close the writer and scanner
            writer.close();
            scanner.close();
            System.out.println("Value written to the file successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}