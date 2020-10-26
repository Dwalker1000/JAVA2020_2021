import java.util.*;

public class calendarBrute {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("how many days are in the month (28-31) ");
            int days = scan.nextInt();
            System.out.println("date of the first sunday (1-7) ");
            int Sun = scan.nextInt();
            dayName();
            topbot();
            System.out.println();
            date(days, Sun);
            topbot();
            System.out.println();
            System.out.println("do you want to create another calendar (yes or no)");
            answer = scan.next();
        }
        while (answer.equalsIgnoreCase("yes"));
}

    public static void dayName() {
        System.out.print("  Sun    Mon    Tue    Wed    Thu    Fri    Sat  ");
        System.out.println();

    }

    public static void topbot() {
        for (int x = 1; x <= 7; x++) {
            System.out.print("+------");
        }
        System.out.print("+");
    }
    public static void date(int days, int sun) {
        if (sun == 1){
            if (days == 28){
                System.out.println("|   1  |   2  |   3  |   4  |   5  |   6  |   7  |");
                System.out.println("|   8  |   9  |  10  |  11  |  12  |  13  |  14  |");
                System.out.println("|  15  |  16  |  17  |  18  |  19  |  20  |  21  |");
                System.out.println("|  22  |  23  |  24  |  25  |  26  |  27  |  28  |");
                System.out.println("|      |      |      |      |      |      |      |");
            }
            if (days == 29){
                System.out.println("|   1  |   2  |   3  |   4  |   5  |   6  |   7  |");
                System.out.println("|   8  |   9  |  10  |  11  |  12  |  13  |  14  |");
                System.out.println("|  15  |  16  |  17  |  18  |  19  |  20  |  21  |");
                System.out.println("|  22  |  23  |  24  |  25  |  26  |  27  |  28  |");
                System.out.println("|  29  |      |      |      |      |      |      |");
            }
            if (days == 30){
                System.out.println("|   1  |   2  |   3  |   4  |   5  |   6  |   7  |");
                System.out.println("|   8  |   9  |  10  |  11  |  12  |  13  |  14  |");
                System.out.println("|  15  |  16  |  17  |  18  |  19  |  20  |  21  |");
                System.out.println("|  22  |  23  |  24  |  25  |  26  |  27  |  28  |");
                System.out.println("|  29  |  30  |      |      |      |      |      |");
            }
            if (days == 31){
                System.out.println("|   1  |   2  |   3  |   4  |   5  |   6  |   7  |");
                System.out.println("|   8  |   9  |  10  |  11  |  12  |  13  |  14  |");
                System.out.println("|  15  |  16  |  17  |  18  |  19  |  20  |  21  |");
                System.out.println("|  22  |  23  |  24  |  25  |  26  |  27  |  28  |");
                System.out.println("|  29  |  30  |  31  |      |      |      |      |");
            }
        }
        if (sun == 2){
            if (days == 28){
                System.out.println("|      |      |      |      |      |      |   1  |");
                System.out.println("|   2  |   3  |   4  |   5  |   6  |   7  |   8  |");
                System.out.println("|   9  |  10  |  11  |  12  |  13  |  14  |  15  |");
                System.out.println("|  16  |  17  |  18  |  19  |  20  |  21  |  22  |");
                System.out.println("|  23  |  24  |  25  |  26  |  27  |  28  |      |");
            }
            if (days == 29){
                System.out.println("|      |      |      |      |      |      |   1  |");
                System.out.println("|   2  |   3  |   4  |   5  |   6  |   7  |   8  |");
                System.out.println("|   9  |  10  |  11  |  12  |  13  |  14  |  15  |");
                System.out.println("|  16  |  17  |  18  |  19  |  20  |  21  |  22  |");
                System.out.println("|  23  |  24  |  25  |  26  |  27  |  28  |  29  |");
            }
            if (days == 30){
                System.out.println("|      |      |      |      |      |      |   1  |");
                System.out.println("|   2  |   3  |   4  |   5  |   6  |   7  |   8  |");
                System.out.println("|   9  |  10  |  11  |  12  |  13  |  14  |  15  |");
                System.out.println("|  16  |  17  |  18  |  19  |  20  |  21  |  22  |");
                System.out.println("|  23  |  24  |  25  |  26  |  27  |  28  |  29  |");
                System.out.println("|  30  |      |      |      |      |      |      |");
            }
            if (days == 31){
                System.out.println("|      |      |      |      |      |      |   1  |");
                System.out.println("|   2  |   3  |   4  |   5  |   6  |   7  |   8  |");
                System.out.println("|   9  |  10  |  11  |  12  |  13  |  14  |  15  |");
                System.out.println("|  16  |  17  |  18  |  19  |  20  |  21  |  22  |");
                System.out.println("|  23  |  24  |  25  |  26  |  27  |  28  |  29  |");
                System.out.println("|  30  |  31  |      |      |      |      |      |");
            }
        }
        if (sun == 3){
            if (days == 28){
                System.out.println("|      |      |      |      |      |   1  |   2  |");
                System.out.println("|   3  |   4  |   5  |   6  |   7  |   8  |   9  |");
                System.out.println("|  10  |  11  |  12  |  13  |  14  |  15  |  16  |");
                System.out.println("|  17  |  18  |  19  |  20  |  21  |  22  |  23  |");
                System.out.println("|  24  |  25  |  26  |  27  |  28  |      |      |");
            }
            if (days == 29){
                System.out.println("|      |      |      |      |      |   1  |   2  |");
                System.out.println("|   3  |   4  |   5  |   6  |   7  |   8  |   9  |");
                System.out.println("|  10  |  11  |  12  |  13  |  14  |  15  |  16  |");
                System.out.println("|  17  |  18  |  19  |  20  |  21  |  22  |  23  |");
                System.out.println("|  24  |  25  |  26  |  27  |  28  |  29  |      |");
            }
            if (days == 30){
                System.out.println("|      |      |      |      |      |   1  |   2  |");
                System.out.println("|   3  |   4  |   5  |   6  |   7  |   8  |   9  |");
                System.out.println("|  10  |  11  |  12  |  13  |  14  |  15  |  16  |");
                System.out.println("|  17  |  18  |  19  |  20  |  21  |  22  |  23  |");
                System.out.println("|  24  |  25  |  26  |  27  |  28  |  29  |  30  |");
            }
            if (days == 31){
                System.out.println("|      |      |      |      |      |   1  |   2  |");
                System.out.println("|   3  |   4  |   5  |   6  |   7  |   8  |   9  |");
                System.out.println("|  10  |  11  |  12  |  13  |  14  |  15  |  16  |");
                System.out.println("|  17  |  18  |  19  |  20  |  21  |  22  |  23  |");
                System.out.println("|  24  |  25  |  26  |  27  |  28  |  29  |  30  |");
                System.out.println("|  31  |      |      |      |      |      |      |");

            }
        }
        if (sun == 4){
            if (days == 28){
                System.out.println("|      |      |      |      |   1  |   2  |   3  |");
                System.out.println("|   4  |   5  |   6  |   7  |   8  |   9  |  10  |");
                System.out.println("|  11  |  12  |  13  |  14  |  15  |  16  |  17  |");
                System.out.println("|  18  |  19  |  20  |  21  |  22  |  23  |  24  |");
                System.out.println("|  25  |  26  |  27  |  28  |      |      |      |");
            }
            if (days == 29){
                System.out.println("|      |      |      |      |   1  |   2  |   3  |");
                System.out.println("|   4  |   5  |   6  |   7  |   8  |   9  |  10  |");
                System.out.println("|  11  |  12  |  13  |  14  |  15  |  16  |  17  |");
                System.out.println("|  18  |  19  |  20  |  21  |  22  |  23  |  24  |");
                System.out.println("|  25  |  26  |  27  |  28  |  29  |      |      |");
            }
            if (days == 30){
                System.out.println("|      |      |      |      |   1  |   2  |   3  |");
                System.out.println("|   4  |   5  |   6  |   7  |   8  |   9  |  10  |");
                System.out.println("|  11  |  12  |  13  |  14  |  15  |  16  |  17  |");
                System.out.println("|  18  |  19  |  20  |  21  |  22  |  23  |  24  |");
                System.out.println("|  25  |  26  |  27  |  28  |  29  |  30  |      |");
            }
            if (days == 31){
                System.out.println("|      |      |      |      |   1  |   2  |   3  |");
                System.out.println("|   4  |   5  |   6  |   7  |   8  |   9  |  10  |");
                System.out.println("|  11  |  12  |  13  |  14  |  15  |  16  |  17  |");
                System.out.println("|  18  |  19  |  20  |  21  |  22  |  23  |  24  |");
                System.out.println("|  25  |  26  |  27  |  28  |  29  |  30  |  31  |");
            }
        }
        if (sun == 5){
            if (days == 28){
                System.out.println("|      |      |      |   1  |   2  |   3  |   4  |");
                System.out.println("|   5  |   6  |   7  |   8  |   9  |  10  |  11  |");
                System.out.println("|  12  |  13  |  14  |  15  |  16  |  17  |  18  |");
                System.out.println("|  19  |  20  |  21  |  22  |  23  |  24  |  25  |");
                System.out.println("|  26  |  27  |  28  |      |      |      |      |");
            }
            if (days == 29){
                System.out.println("|      |      |      |   1  |   2  |   3  |   4  |");
                System.out.println("|   5  |   6  |   7  |   8  |   9  |  10  |  11  |");
                System.out.println("|  12  |  13  |  14  |  15  |  16  |  17  |  18  |");
                System.out.println("|  19  |  20  |  21  |  22  |  23  |  24  |  25  |");
                System.out.println("|  26  |  27  |  28  |  29  |      |      |      |");
            }
            if (days == 30){
                System.out.println("|      |      |      |   1  |   2  |   3  |   4  |");
                System.out.println("|   5  |   6  |   7  |   8  |   9  |  10  |  11  |");
                System.out.println("|  12  |  13  |  14  |  15  |  16  |  17  |  18  |");
                System.out.println("|  19  |  20  |  21  |  22  |  23  |  24  |  25  |");
                System.out.println("|  26  |  27  |  28  |  29  |  30  |      |      |");
            }
            if (days == 31){
                System.out.println("|      |      |      |   1  |   2  |   3  |   4  |");
                System.out.println("|   5  |   6  |   7  |   8  |   9  |  10  |  11  |");
                System.out.println("|  12  |  13  |  14  |  15  |  16  |  17  |  18  |");
                System.out.println("|  19  |  20  |  21  |  22  |  23  |  24  |  25  |");
                System.out.println("|  26  |  27  |  28  |  29  |  30  |  31  |      |");
            }
        }
        if (sun == 6){
            if (days == 28){
                System.out.println("|      |      |   1  |   2  |   3  |   4  |   5  |");
                System.out.println("|   6  |   7  |   8  |   9  |  10  |  11  |  12  |");
                System.out.println("|  13  |  14  |  15  |  16  |  17  |  18  |  19  |");
                System.out.println("|  20  |  21  |  22  |  23  |  24  |  25  |  26  |");
                System.out.println("|  27  |  28  |      |      |      |      |      |");
            }
            if (days == 29){
                System.out.println("|      |      |   1  |   2  |   3  |   4  |   5  |");
                System.out.println("|   6  |   7  |   8  |   9  |  10  |  11  |  12  |");
                System.out.println("|  13  |  14  |  15  |  16  |  17  |  18  |  19  |");
                System.out.println("|  20  |  21  |  22  |  23  |  24  |  25  |  26  |");
                System.out.println("|  27  |  28  |  29  |      |      |      |      |");
            }
            if (days == 30){
                System.out.println("|      |      |   1  |   2  |   3  |   4  |   5  |");
                System.out.println("|   6  |   7  |   8  |   9  |  10  |  11  |  12  |");
                System.out.println("|  13  |  14  |  15  |  16  |  17  |  18  |  19  |");
                System.out.println("|  20  |  21  |  22  |  23  |  24  |  25  |  26  |");
                System.out.println("|  27  |  28  |  29  |  30  |      |      |      |");
            }
            if (days == 31){
                System.out.println("|      |      |   1  |   2  |   3  |   4  |   5  |");
                System.out.println("|   6  |   7  |   8  |   9  |  10  |  11  |  12  |");
                System.out.println("|  13  |  14  |  15  |  16  |  17  |  18  |  19  |");
                System.out.println("|  20  |  21  |  22  |  23  |  24  |  25  |  26  |");
                System.out.println("|  27  |  28  |  29  |  30  |  31  |      |      |");
            }
        }
        if (sun == 7){
            if (days == 28){
                System.out.println("|      |   1  |   2  |   3  |   4  |   5  |   6  |");
                System.out.println("|   7  |   8  |   9  |  10  |  11  |  12  |  13  |");
                System.out.println("|  14  |  15  |  16  |  17  |  18  |  19  |  20  |");
                System.out.println("|  21  |  22  |  23  |  24  |  25  |  26  |  27  |");
                System.out.println("|  28  |      |      |      |      |      |      |");
            }
            if (days == 29){
                System.out.println("|      |   1  |   2  |   3  |   4  |   5  |   6  |");
                System.out.println("|   7  |   8  |   9  |  10  |  11  |  12  |  13  |");
                System.out.println("|  14  |  15  |  16  |  17  |  18  |  19  |  20  |");
                System.out.println("|  21  |  22  |  23  |  24  |  25  |  26  |  27  |");
                System.out.println("|  28  |  29  |      |      |      |      |      |");
            }
            if (days == 30){
                System.out.println("|      |   1  |   2  |   3  |   4  |   5  |   6  |");
                System.out.println("|   7  |   8  |   9  |  10  |  11  |  12  |  13  |");
                System.out.println("|  14  |  15  |  16  |  17  |  18  |  19  |  20  |");
                System.out.println("|  21  |  22  |  23  |  24  |  25  |  26  |  27  |");
                System.out.println("|  28  |  29  |  30  |      |      |      |      |");
            }
            if (days == 31){
                System.out.println("|      |   1  |   2  |   3  |   4  |   5  |   6  |");
                System.out.println("|   7  |   8  |   9  |  10  |  11  |  12  |  13  |");
                System.out.println("|  14  |  15  |  16  |  17  |  18  |  19  |  20  |");
                System.out.println("|  21  |  22  |  23  |  24  |  25  |  26  |  27  |");
                System.out.println("|  28  |  29  |  30  |  31  |      |      |      |");
            }
        }
    }
}
