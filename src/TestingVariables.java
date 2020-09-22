public class TestingVariables {
    public static void main(String [] args){
        byte num;
        int intnum;
        short numshort = 4;
        long numlong = 999999999;
        float numfloat = 3;
        double numdouble = 3.45;
        char letter = 'd';
//        num = 1;
//        intnum = 1234;
//        System.out.println("These are my numbers \nmy byte var = "+num+"\nmy int var = "+intnum+ "\nmy short var = "+numshort);
//        System.out.println("my float var = "+numfloat);
//        System.out.println("my long var = "+numlong);
//        System.out.println("my doubble var = "+numdouble);
        int subtotal = 38+40+30;
        double tax = subtotal*0.08f;
        float tips = subtotal *0.15f;
        double total = (tax+tips+subtotal);
        System.out.printf("subtotal: %8d  \n",subtotal);
        System.out.printf("tax: \t %8.2f \n", tax);
        System.out.printf("tips:\t %8.2f \n", tips);
        System.out.printf("total:\t %8.2f \n", total);
    }
}
