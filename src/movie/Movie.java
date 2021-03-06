package movie;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    private int Length;

    public Movie(){
        title = "None";
        studio = "None";
        rating = "None";
        Length = 0;
    }
    public Movie(String titleIn, String studioIn, String ratingIn, int lengthIn){
        title = titleIn;
        studio = studioIn;
        rating = ratingIn;
        Length = lengthIn;
    }
    public Movie(String titleIn, String studioIn){
        title = titleIn;
        studio = studioIn;
        rating = "PG";
        Length = 116;
    }
    //title
    public String GetTitle (){
        return title;
    }
    public String ChangeTitle (String in){
        title = in;
        return title;
    }
    //studio
    public String GetStudio (){
        return studio;
    }
    public String ChangeStudio (String in){
        studio = in;
        return studio;
    }
    //rating
    public String GetRating (){
        return rating;
    }
    public String ChangeRating (String in){
        rating = in;
        return rating;
    }
    //length
    public int GetLength(){
        return Length;
    }
    public int ChangeLength(int LengthIn){
        Length = LengthIn;
        return Length;
    }
    //to string
    public String toString(){
        String string = "the title is: " + title + "\nit last: "+ Length +" minutes\nthe studio is: " + studio + "\nit was rated: " + rating;
        return string;
    }
    public String[] getPG(){
        String[] MovieName = {"Jaws", "Infinity war", "The Croods", "The Grinch", "Iron Man"};
        String[] MovieRating = {"PG", "PG-13", "PG", "PG", "PG-13"};
        String[] PgRating = new String [MovieRating.length-2];
        int y = 0;
        for (int i = 0; i<= MovieRating.length-1; i++){
            if (MovieRating[i] == "PG"){
                PgRating [y]= MovieName[i];
                y+=1;
            }
        }
        return PgRating;
    }
    public Movie(Movie Casino){
        title = "Casino Royale";
        studio = "Eon Productions";
        rating = "PG-13";
        Length = 107;
        Casino = new Movie(title,studio,rating,Length);
    }
    public String compareTime(){
        int dif = Length-107;
        String output = "";
        if (dif <= 0){
            dif = Math.abs(dif);
            output = "the second movie is " + dif + " minutes longer than the first movie";
        }
        if (dif > 0){
            output = "the first movie is " + dif + " minutes longer than the second movie";
        }
        return output;
    }
}
