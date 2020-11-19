import java.util.*;

public class MovieClient {
    public static void main(String [] args){
        Movie Movie = new Movie();
        Movie = new Movie("Iron Man", "Marvel", "PG-13", 126);
        System.out.println(Movie.toString());
        System.out.println();
        String [] Array = new String[Movie.getPG().length];
        Array = Movie.getPG();
        for (int i = 0; i <= Movie.getPG().length-1; i++) {
            System.out.print(Array[i]);
            if (Movie.getPG().length-1 != i){
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        Movie Second = new Movie();
        Second = new Movie("Iron Man 2", "Marvel", "PG-13", 124);
        System.out.println(Second.toString());
        System.out.println();
        System.out.println(Movie.compareTime(Second));
    }
}
