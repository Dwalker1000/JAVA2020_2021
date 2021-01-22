package Files;//imports
import java.io.*;
import java.util.*;
public class FileWork {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Files.LearningFiles.java"));
//prints file contents
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }
}
