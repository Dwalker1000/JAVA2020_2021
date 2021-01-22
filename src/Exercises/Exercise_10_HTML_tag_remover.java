package Exercises;

import java.io.*;
import java.util.*;
public class Exercise_10_HTML_tag_remover {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        //creates new file
        PrintStream newFile = new PrintStream("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\NewRandomeFile.txt");
        System.out.println("whats the full pah to your file");
        String name = in.nextLine().replace("\\", "\\\\");
        Scanner scan = new Scanner(new File(name));
        stripHtmlTags(scan, newFile);
    }

    public static void stripHtmlTags(Scanner input, PrintStream newFile) {
        while (input.hasNextLine()) {
            String line = input.nextLine();

            while (line.contains("<") || line.contains(">")) {
                int index1 = line.indexOf("<");
                int index2 = line.indexOf(">");
                if (index1 == 0) {
                    line = line.substring(index2 + 1);
                } else {
                    line = line.substring(0, index1) + line.substring(index2 + 1);
                }
            }
            //adds to the new file
            newFile.println(line);
        }
    }
}