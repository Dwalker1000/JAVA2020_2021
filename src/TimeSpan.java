// Represents a time span of elapsed hours and minutes.
// Second implementation using a single field for total minutes.
// Class invariant: totalMinutes >= 0
public class TimeSpan {
    private int totalMinutes;
    // Constructs a time span with the given interval.
    // pre: hours >= 0 && minutes >= 0
    public TimeSpan(int hours, int minutes) {
        totalMinutes = 0;
        add(hours, minutes);
        }
    // Adds the given interval to this time span.
    // pre: hours >= 0 && minutes >= 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes += 60 * hours + minutes;
        }
        // returns a String for this time span, such as "6h 15m"
    public String toString() {
        return (totalMinutes / 60) + "h " +
        (totalMinutes % 60) + "m";
    }
    //hw
    public void add(TimeSpan span){
        add(span);
    }
    public void subtract(TimeSpan span){
        subtract(span);
    }
    public void scale(int factor){
        totalMinutes *= factor;
    }
}