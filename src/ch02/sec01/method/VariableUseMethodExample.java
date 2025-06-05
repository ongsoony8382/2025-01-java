package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10,20); //10:20
        printTime(2,9); //02:09
        printTime(12, 9, 22); //12:09:22


    }

    public static String parseTime(int val){
        return val < 10 ? "0" + val : String.valueOf(val);
    }

    public static void printTime(int hour, int min){
        System.out.printf("%02d:%02d\n", hour, min);
    }
    public static void printTime(int hour, int min, int sec){
        System.out.println(parseTime(hour) + ":");
        printTime(min,sec);

        System.out.printf("%02d:%02d:%02d\n", hour, min, sec);








        //System.out.printf("%02d:%02d\n", hour, min);

        /*if (hour < 10 && min < 10 ){
            System.out.println("0" + hour + ":" + "0" + min);


        } else
            System.out.println(hour + ":" + min);
        }*/






    }}


