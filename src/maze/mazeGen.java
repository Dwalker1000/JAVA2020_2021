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
        String [] layer3 = new String[15];
        third(random,layer2,layer3);
        String [] layer4 = new String[15];
        third(random,layer3,layer4);
        String [] layer5 = new String[15];
        third(random,layer4,layer5);
        String [] layer6 = new String[15];
        third(random,layer5,layer6);
        String [] layer7 = new String[15];
        third(random,layer6,layer7);
        String [] layer8 = new String[15];
        third(random,layer7,layer8);
        String [] layer9 = new String[15];
        third(random,layer8,layer9);
        String [] layer10 = new String[15];
        third(random,layer9,layer10);
        String [] layer11 = new String[15];
        third(random,layer10,layer11);
        String [] layer12 = new String[15];
        third(random,layer11,layer12);
        String [] layer13 = new String[15];
        third(random,layer12,layer13);
        String [] layer14 = new String[15];
        third(random,layer13,layer14);
        String [] layer15 = new String[15];
        third(random,layer14,layer15);
        end(random,layer15);
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

    public static void third(Random random, String [] secondLayer, String [] layer){
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
                    layer [i] = star;
                }
                else{
                    System.out.print(space);
                    layer [i] = space;
                }
            }
            //space then wall
            else if (secondLayer[i] == space && secondLayer[i+1] == star){
                System.out.print(space);
                layer [i] = space;
            }
            //2 spaces then wall
            else if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == star){
                if (secondLayer[i] == space && secondLayer[i+1] == space){
                    int odds = random.nextInt(2);
                    if (odds == 0){
                        System.out.print(space);
                        System.out.print(star);
                        layer [i] = space;
                        layer [i+1] = star;
                    }
                    if (odds == 1){
                        System.out.print(star);
                        System.out.print(space);
                        layer [i] = star;
                        layer [i+1] = space;
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
                        layer [i] = space;
                        layer [i+1] = star;
                        layer [i+2] = star;
                    }
                    if (odds == 1){
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(star);
                        layer [i] = star;
                        layer [i+1] = space;
                        layer [i+2] = star;
                    }
                    else{
                        System.out.print(star);
                        System.out.print(star);
                        System.out.print(space);
                        layer [i] = star;
                        layer [i+1] = star;
                        layer [i+2] = space;
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
                        layer [i] = space;
                        layer [i+1] = star;
                        layer [i+2] = star;
                        layer [i+3] = space;
                    }
                    if (odds == 1){
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(star);
                        System.out.print(space);
                        layer [i] = star;
                        layer [i+1] = space;
                        layer [i+2] = star;
                        layer [i+3] = space;
                    }
                    if (odds == 2){
                        System.out.print(space);
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(star);
                        layer [i] = space;
                        layer [i+1] = star;
                        layer [i+2] = space;
                        layer [i+3] = star;
                    }
                    else{
                        System.out.print(star);
                        System.out.print(space);
                        System.out.print(space);
                        System.out.print(star);
                        layer [i] = star;
                        layer [i+1] = space;
                        layer [i+2] = space;
                        layer [i+3] = star;
                    }
                }
                i+=4;
            }
            //5+ spaces
            else if (secondLayer[i] == space && secondLayer[i+1] == space && secondLayer[i+2] == space && secondLayer[i+3] == space && secondLayer[i+4] == space){
                int x = i+1;
                int count = 0;
                while (secondLayer[x] == space){
                    int odds = random.nextInt(3);
                    if (odds == 0){
                        System.out.print(space);
                        layer [x] = space;
                    }
                    if (odds == 1){
                        System.out.print(space);
                        layer [x] = space;
                    }
                    if(odds == 2){
                        System.out.print(star);
                        layer [x] = star;
                    }
                    count+=1;
                    x+=1;
                }
                i+=count;
            }
        }
        System.out.print(star);
    }

    public static void end(Random random, String [] last){
        System.out.println();
        String space = " ";
        String star = "*";
        int x = 0;
        int [] spaces = new int [15];
        for (int i = 0; i< last.length; i++){
            if (last[i] == space){
                spaces[x] = i;
                x +=1;
            }
        }
        int rad = random.nextInt(x);
        int end = spaces[rad];
        for (int i = 0; i<end; i++){
            System.out.print(star);
        }
        System.out.print(space);
        for (int i = 16; i>end; i--){
            System.out.print(star);
        }
    }
}
