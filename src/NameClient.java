public class NameClient {
    public static void main(String a[]) {
        Name Name = new Name();
        String FirstName = Name.first();
        String LastName = Name.last();
        char MiddleInitial = Name.mid().charAt(0);
        System.out.println("First name "+FirstName);
        System.out.println("first letter of middle name is "+MiddleInitial);
        System.out.println("Last name "+LastName);
    }
}