package maze;
import java.util.*;
public class mazeGen {
    public static int Size = 16;

    public static void main(String[] args) {
        Random random = new Random();
        //finds start
        int start = random.nextInt(Size-2)+2;
        //first line
        first(start);
        String [] layer2 = new String[15];
        second(start, random, layer2);
        third(random,layer2);
        end(random);
    }

    public static void first(int start){
        int end = Size-start;
        //first line
        //spaces before the start point
        for (int i = 0; i<start-1; i++){
            System.out.print("*");
        }
        //start
        System.out.print(" ");
        //spaces after start
        for (int i = 0; i <end;i++){
            System.out.print("*");
        }
    }

    public static void second(int start, Random random, String [] secondLayer){
        System.out.println();
        System.out.print("*");
        String space = " ";
        String star = "*";
        for (int i = 0; i<=Size-3; i++){
            int odds = random.nextInt(4)+1;
            if (i == start-2){
                secondLayer [i] = space;
                System.out.print((secondLayer[i]));
            }
            else if (odds == 1){
                secondLayer [i] = star;
                System.out.print(secondLayer[i]);
            }
            else{
                secondLayer [i] = space;
                System.out.print(secondLayer[i]);
            }
        }
        System.out.print("*");
    }

    public static void third(Random random, String [] secondLayer){
        System.out.println();
        String space = " ";
        String star = "*";
        System.out.print(star);
        for (int i = 0; i<=secondLayer.length-1;i++) {
            //wall 50/50
            if (secondLayer[i] == star){
                int rand = random.nextInt(2);
                if (rand == 1){
                    System.out.print(star);
                }
                else{
                    System.out.print(space);
                }
            }
            //space then wall
            else if (secondLayer[i] == space && secondLayer[i+1] == star){
                System.out.print(space);
            }
            //2 spaces then wall
            else if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == star){
                if (secondLayer[i] == space && secondLayer[i+1] == space){
                    int odds = random.nextInt(2);
                    if (odds == 0){
                        System.out.print(space);
                        System.out.print(star);
                    }
                    if (odds == 1){
                        System.out.print(star);
                        System.out.print(space);
                    }
                }
                i+=2;
            }
            //3 spaces then wall
            else if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == space && secondLayer[i+3] == star){
                if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == space){
                    int odds = random.nextInt(3);
                    if (odds == 0){
                        System.out.print(space);
                        System.out.print(star);
                        System.out.print(star);
                    }
                    if (odds == 1){
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(star);
                    }
                    else{
                        System.out.print(star);
                        System.out.print(star);
                        System.out.print(space);
                    }
                }
                i+=3;
            }
            //4 spaces then wall
            else if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == space && secondLayer[i+3] == space && secondLayer[i+4] == star){
                if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == space && secondLayer[i+3] == space){
                    int odds = random.nextInt(4);
                    if (odds == 0){
                        System.out.print(space);
                        System.out.print(star);
                        System.out.print(star);
                        System.out.print(space);
                    }
                    if (odds == 1){
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(star);
                        System.out.print(space);
                    }
                    if (odds == 2){
                        System.out.print(space);
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(star);
                    }
                    else{
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(space);
                        System.out.print(star);
                    }
                }
                i+=4;
            }
            //5+ spaces
            else if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == space && secondLayer[i+3] == space && secondLayer[i+4] == space){
                int x = i+0;
                int count = 0;
                while (secondLayer[x] == space){
                    int odds = random.nextInt(3);
                    if (odds == 0){
                        System.out.print(space);
                    }
                    if (odds == 1){
                        System.out.print(space);
                    }
                    if(odds == 2){
                        System.out.print(star);
                    }
                    count+=1;
                    x+=1;
                }
                i+=count;
            }
        }
        System.out.print(1);
    }


    public static void end(Random random){
        System.out.println();
        int endpoint = random.nextInt(14)+2;
        int end = 16-endpoint;
        //first line
        //spaces before the end
        for (int i = 0; i<endpoint-1; i++){
            System.out.print("*");
        }
        //ends
        System.out.print(" ");
        //spaces after end
        for (int i = 0; i <end;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
