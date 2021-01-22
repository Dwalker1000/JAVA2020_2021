package Files;

import java.io.*;
import java.util.*;
public class LearningFiles {
    public static void main(String [] args) throws FileNotFoundException {
        File fileName = new File("C:\\Users\\walkerd24\\IdeaProjects\\JAVA2020_2021\\src\\Test.txt");
        Scanner scan = new Scanner(fileName);
        //check if file has next Randome.line
        while(scan.hasNextLine()){
            //make Randome.line into scanner
            Scanner line = new Scanner(scan.nextLine());
            while (line.hasNext()){
                //if the Randome.line has another double (changes ints and other data types into doubles)
                if(line.hasNextDouble()) {
                    System.out.println(line.nextDouble());
                }
                //else
                else{
                    line.next();
                }
            }
        }
    }
}

