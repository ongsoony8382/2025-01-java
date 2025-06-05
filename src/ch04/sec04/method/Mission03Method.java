package ch04.sec04.method;

import ch03.sec11.ScoreMethodExample;

public class Mission03Method {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3,7);
       // System.out.println("star: " + star);

        //콘솔에 출력
        //5였다면 ***** (개행)
        //3이었다면 *** (개행)

        //printSingleLine(star);


        printMultiLine(4);
        //****
        //****
        //****
        //****
        printMultiLine(3);
        System.out.println("============");
        printTriangleLine(4);

    }

    public static void printSingleLine(int num){
        for(int i=0; i<num; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printMultiLine(int num){
        for(int i=0; i< num; i++){
            printSingleLine(num);
        }
    }

    public static void printTriangleLine(int num){
        for(int i=0 ; i<= num; i++){
            for(int k=1; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
