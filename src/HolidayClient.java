public class HolidayClient {
    public static void main(String [] args){
        Holiday first = new Holiday();
        first = new Holiday("ThanksGiving", 26, "November");
        System.out.println(first.toString());
        Holiday Second = new Holiday();
        Second = new Holiday("Halloween", 31, "October");
        System.out.println(Second.toString());
        System.out.println(first.inSameMonth(Second));
        System.out.println(first.AvgDate());
        System.out.println(first.AvgMonth());
    }
}
