public class Name {
    public String first() {
        String firstName = "Daniel";
        return firstName;
    }
    public String last() {
        String lastName = "Walker";
        return lastName;
    }
    public String mid(){
        String ogmidint = "larence";
        char middleInitial = ogmidint.charAt(0);
        String midint = String.valueOf(middleInitial);
        return midint;
    }
    public String getNormalOrder(){
        String order = first() + " " + mid() + ". " + last();
        return order;
    }
    public String getReversedOrder() {
        String rev = last() + " " + mid() + ". " + first();
        return rev;
    }
}
