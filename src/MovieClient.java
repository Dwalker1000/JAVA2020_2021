import java.util.Arrays;

public class MovieClient {
    public static void main(String [] args){
        Movie Movie = new Movie();
        Movie = new Movie("Iron Man", "Marvel", "PG-13", 126);
        System.out.println(Movie.toString());
        System.out.println();

        for (int i = 0; i <= Movie.getPG().length-2; i++) {
            System.out.println(Arrays.stream(Movie.getPG()));
        }
        System.out.println();
        Movie Second = new Movie();
        Second = new Movie("Iron Man 2", "Marvel", "PG-13", 124);
        System.out.println(Second.toString());
        System.out.println();
        System.out.println(Movie.compareTime(Second));
        System.out.println();
    }
}
