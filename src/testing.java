import Final.Inventory;

public class testing {
    public static void main(String[] args) {
        String [] inventory_Array = {"hi", "no", "good", "bad"};
        for (int i = 0; i<= inventory_Array.length-1; i++){
            System.out.println();
            System.out.print(i + ". ");
            String name = inventory_Array[i];
            System.out.print(name);

        }
    }
}