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
        String string = "the title is: " + title + "\nit last: "+ Length +"\nthe studio is: " + studio + "\nit was rated: " + rating;
        return string;
    }
    public String[] getPG(){
        String[] MovieName = {"Jaws", "Infinity war", "The Croods", "The Grinch", "Iron Man"};
        String[] MovieRating = {"PG", "PG-13", "PG", "PG", "PG-13"};
        String[] PgRating = {};
        int y = 0;
        for (int i = 0; i<= MovieRating.length; i++){
            String x = MovieRating[i];
            if (x == "PG"){
                PgRating [y]= x;
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
    }
    public String compareTime(Movie second){
        int dif = Length-second.Length;
        String output = "";
        if (dif <= 0){
            dif = Math.abs(dif);
            output = "the second movie is " + dif + " minutes longer han the first movie";
        }
        if (dif >= 0){
            output = "the first movie is " + dif + " minutes longer than he second movie";
        }
        return output;
    }

}
