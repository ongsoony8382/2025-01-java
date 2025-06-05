package ch04.sec04.method;

public class Mission02Method {
    public static void main(String[] args) {
        printNumberFromTo(2,6); // [2,3,4,5,6]
    }

    public static void printNumberFromTo(int num1, int num2){
        for(int i=num1; i<num2+1; i++){
            if(i==num1){
                System.out.printf("[%d,", num1);
            } else if (i==num2){
                System.out.printf("%d]", num2);
            }else{
                System.out.printf("%d,", i);
            }
        }

    }
}
