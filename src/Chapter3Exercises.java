import java.util.Scanner;
public class Chapter3Exercises {
    public static void main(String[] args) {
        printNumbers(10);
        printNumbers(5);
        System.out.println();
        printPowers2(10);
        printPowers2(5);
        System.out.println();
        printPowersOfX(5, 5);
        printPowersOfX(10, 5);
        System.out.println();
        printSquare(1, 5);
        printSquare(3, 8);
        printGrid( 5,5);
        printGrid(4,6);
        largerAbsVal2(11,-22);
        largerAbsVal2(-5, 7);
        System.out.println();
        largerAbsVal3(-7, -9, 16);
        largerAbsVal3(8, 3, -7);
        System.out.println();
        quadratic(1,-7,12);
        quadratic(2,6,8);
        System.out.println();
        distance(10,2,3,5);
        distance(1,0,4,4);
        System.out.println();
        scientific(6.23, 5);
        scientific(1.9,-2);
        System.out.println();
        padString("strings", 10);
        padString("Loops", 5);
        System.out.println();
        vertical("hey now");
        System.out.println();
        printReverse("hello there!");
        System.out.println();
        inputBirthday();
        System.out.println();
        processName();
    }

    public static void printNumbers(int data) {
        for (int number = 0; number <= data; number++) {
            System.out.print(" [" + number + "] ");
        }
        System.out.println();
    }

    public static void printPowers2(int data) {
        System.out.print(1);
        for (int number = 1; number <= data; number++) {
            System.out.print(" ");
            System.out.print(number * 2);
        }
        System.out.println();
    }

    public static void printPowersOfX(int power, int reps) {
        System.out.print(1);
        int pow = power;
        for (int rep = 1; rep <= reps; rep++) {
            System.out.print(" ");
            System.out.print(power);
            power = power * pow;
        }
        System.out.println();
    }

    public static void printSquare(int start, int end) {
        for (int ln = start; ln <= end; ln++) {
                for (int x = ln; x <= end; x++) {
                    System.out.print(x);
                }
            for (int j = start; j <= ln-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printGrid (int rows, int columns){
        for (int ln = 1; ln <= rows; ln++){
            for (int x = 1; x <= columns; x++){
                int num = ln+rows*(x-1);
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void largerAbsVal2 (int x, int y){
        int larger = Math.max(Math.abs(x), Math.abs(y));
        System.out.println(larger);
    }
    public static void largerAbsVal3 (int x, int y, int z){
        int larger = Math.max(Math.abs(x), Math.abs(y));
        int largest = Math.max(Math.abs(larger), Math.abs(z));
        System.out.println(largest);
    }
    public static void quadratic(int ab, int b, int c){
        int a = ab*ab;
        double a1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double a2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(a1);
        System.out.println(a2);
    }
    public static void distance(int x1, int y1, int x2, int y2){
        double dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
        System.out.println(dis);
    }
    public static void scientific(double num1, double num2){
        double scientific = num1 * Math.pow(10, num2);
        System.out.println(scientific);
    }
    public static void padString(String word, int length){
        StringBuilder string = new StringBuilder();
        while (string.length() < length - word.length()) {
            string.append(' ');
        }
        System.out.print(word + string);
        System.out.print('/');
        System.out.println();
    }
    public static void vertical(String word){
        for (int x = 0; x <= word.length()-1; x++){
            System.out.println(word.charAt(x));
        }
    }
    public static void printReverse(String word){
        String reverse = "";
        int length = word.length();
        for(int x = length-1; x>= 0; x--){
            reverse = reverse+word.charAt(x);
        }
        System.out.println(reverse);
    }
    public static void inputBirthday(){
        Scanner sc= new Scanner(System.in);
        System.out.println("On what day of the month were you born?");
        String month=sc.nextLine();

        System.out.println("What is the name of the month in which you were born?");
        int day=sc.nextInt();

        System.out.println("During what year were you born?");
        int year=sc.nextInt();

        System.out.print("wou were born on " + month + " " + day + " " + year);
    }
    public static void processName() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String full=sc.nextLine();
        int x = full.indexOf(" ");
        int y = full.length();
        String first=full.substring(0, x);
        String second=full.substring(x, y);
        System.out.print("Your name in reverse order is: "+ second + "," + first);
    }

}

