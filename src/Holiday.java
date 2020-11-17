import java.awt.event.MouseAdapter;
import java.util.*;
public class Holiday {
    private String Name;
    private int Day;
    private String Month;
    Holiday Independence = new Holiday();
    public Holiday(){
        Name = "New Year";
        Day = 1;
        Month = "January";
        Independence = new Holiday("Independence Day", 4, "July");
    }
    public Holiday(String NameIn, int DayIn, String MonthIn){
        Name = NameIn;
        Day = DayIn;
        Month = MonthIn;
    }
    //Name
    public String GetName(){
        return Name;
    }
    public String ChangeName(String change){
        Name = change;
        return Name;
    }
    //Day
    public int GetDay(){
        return Day;
    }
    public int ChangeDay(int change){
        Day = change;
        return Day;
    }
    //Month
    public String GetMonth(){
        return Month;
    }
    public String ChangeMonth(String change){
        Month = change;
        return Month;
    }
    //to string
    public String toString(){
        String string = Name + " is on "+ Month + " " + Day;
        return string;
    }
    public boolean inSameMonth(Holiday second){
        return second.Month == Month;
    }
    public double AvgDate(){
        List list=new ArrayList();
        list.add(25);
        list.add(26);
        list.add(31);
        list.add(7);
        list.add(21);
        double count = 0;
        for (int i = 1; i <= list.size(); i++){
            count += list.indexOf(i);
        }
        count = count/list.size();
        return count;
    }
    public double AvgMonth(){
        List list=new ArrayList();
        list.add(1);
        list.add(12);
        list.add(11);
        list.add(10);
        list.add(4);
        double count = 0;
        for (int i = 1; i <= list.size(); i++){
            count += list.indexOf(i);
        }
        count = count/list.size();
        return count;
    }
}
