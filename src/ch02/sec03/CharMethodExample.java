package ch02.sec03;

public class CharMethodExample {



    public static void main(String[] args) {



        printCharToInt('c');
        printCharToInt('가');
        int val = getCharToInt('c');
        System.out.println(val);




    }
    public static void printCharToInt(char c){
        System.out.printf("%c: %d\n", c, (int)c);

    }

    public static int getCharToInt(char c){
        return (int)c;
    }
}
