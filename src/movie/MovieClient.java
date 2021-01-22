package movie;

import movie.Movie;

import java.util.*;
public class MovieClient {
    public static void main(String [] args){
        boolean on = true;
        Scanner scan= new Scanner(System.in);
        Movie movie = new Movie();
        do{
            int xyz = 1;
            if (xyz == 1) {
                menu();
                int x = scan.nextInt();
                if (x == 1) {
                    newMovie(movie, scan);
                }
                if (x == 2){
                    System.out.println(movie.GetTitle());
                }
                if (x == 3){
                    changeTitle(movie, scan);
                }
                if (x == 4){
                    System.out.println(movie.GetStudio());
                }
                if (x == 5){
                    changeStudio(movie, scan);
                }
                if (x == 6){
                    System.out.println(movie.GetRating());
                }
                if (x == 7){
                    changeRating(movie, scan);
                }
                if (x == 8){
                    System.out.println(movie.GetLength());
                }
                if (x == 9){
                    changeLength(movie, scan);
                }
                if (x == 10){
                    System.out.println(movie.toString());
                }
                if (x == 11){
                    String [] Array = new String[movie.getPG().length];
                    Array = movie.getPG();
                    for (int i = 0; i <= movie.getPG().length-1; i++) {
                        System.out.print(Array[i]);
                        if (movie.getPG().length-1 != i){
                            System.out.print(", ");
                        }
                    }
                    System.out.println(" ");
                }
                if (x == 12){
                    System.out.println(movie.compareTime());
                }
                if (x == 13){
                    System.out.println("thanks for using the Program");
                    on = false;
                    break;
                }
            }
        }while (on);
    }
    public static void menu(){
        System.out.println("**********************************");
        System.out.println("*              Menu              *");
        System.out.println("*                                *");
        System.out.println("* 1. Create new movie            *");
        System.out.println("* 2. See Title                   *");
        System.out.println("* 3. Change Title                *");
        System.out.println("* 4. See Studio                  *");
        System.out.println("* 5. Change Studio               *");
        System.out.println("* 6. See Rating                  *");
        System.out.println("* 7. Change Rating               *");
        System.out.println("* 8. See Length                  *");
        System.out.println("* 9. Change Length               *");
        System.out.println("* 10. movie.Movie Details              *");
        System.out.println("* 11. what movies are PG         *");
        System.out.println("* 12. Compare movie.Movie Lengths      *");
        System.out.println("* 13. Exit                       *");
        System.out.println("**********************************");
    }
    public static void newMovie(Movie movie, Scanner scan){
        System.out.println("what is the Movies name");
        String title = scan.next();
        movie.ChangeTitle(title);
        System.out.println("what studio made the movie");
        String studio = scan.next();
        movie.ChangeStudio(studio);
        System.out.println("what is the movie rated");
        String rating = scan.next();
        movie.ChangeRating(rating);
        System.out.println("how long is the movie (min)");
        int length = scan.nextInt();
        movie.ChangeLength(length);
        Movie movie1 = new Movie(title, studio, rating, length);
    }
    public static void changeTitle(Movie movie, Scanner scan){
        System.out.println("What do you want to change the title to");
        String title = scan.next();
        movie.ChangeTitle(title);
    }
    public static void changeStudio(Movie movie, Scanner scan){
        System.out.println("What do you want to change the studio to");
        String studio = scan.next();
        movie.ChangeStudio(studio);
    }
    public static void changeRating(Movie movie, Scanner scan){
        System.out.println("What do you want to change the Rating to");
        String Rating = scan.next();
        movie.ChangeRating(Rating);
    }
    public static void changeLength(Movie movie, Scanner scan){
        System.out.println("What do you want to change the Length of the movie to (min)");
        int min = scan.nextInt();
        movie.ChangeLength(min);
    }
}
