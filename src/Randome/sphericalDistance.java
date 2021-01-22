package Randome;

import java.util.*;
public class sphericalDistance {
    public static final double radius = 6372.795;
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("whats the name of your first city");
            String city1 = scan.next();
            System.out.println("whats the latitude of your first city in decimals");
            double lat1 = scan.nextDouble();
            System.out.println("whats the longitude of your first city in decimals");
            double long1 = scan.nextDouble();
            System.out.println("whats the name of your second city");
            String city2 = scan.next();
            System.out.println("whats the latitude of your second city in decimals");
            double lat2 = scan.nextDouble();
            System.out.println("whats the longitude of your second city in decimals");
            double long2 = scan.nextDouble();
            lat1 = Math.toRadians(lat1);
            long1 = Math.toRadians(long1);
            lat2 = Math.toRadians(lat2);
            long2 = Math.toRadians(long2);
            double VarAngle = Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
            double distance = radius * VarAngle;
            System.out.print("the distance between " + city1 + " and " + city2 + "is ");
            System.out.print(distance);
            System.out.println(" km ");
            System.out.println("do you want to calculate the distance between two points (yes or no)");
            answer = scan.next();
        }
        while (answer.equalsIgnoreCase("yes"));
    }
}