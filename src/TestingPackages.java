/*
Daniel Walker
Testing packages and classes
String is an array of characters
Array: is a collection like a post office boxes
oct 5th/2020
 */

import java.text.DecimalFormat;//specific import
import java.util.*; //import all classes of the package
public class TestingPackages {
    public static void main (String [] args) {
        String s1 = new String("Hello ");
        String s2 = "there"; // String does not require "new" to create
        String s3 = s1 + s2; // "+" means concatcanation printing one afetr another
        System.out.println(s3);
        s3 +="!";
        System.out.println(s3);
        int len = s3.length();
        System.out.println("the len = " + len);
        int indexnum = s3.indexOf(' ');
        System.out.println(indexnum);
        String lastword = s3.substring(indexnum+1);//form the number to the end
        System.out.println(lastword);
        lastword = s3.substring(indexnum+1, len-1);//beginning is include, the end is excluded
        System.out.println(lastword);
    }
}
