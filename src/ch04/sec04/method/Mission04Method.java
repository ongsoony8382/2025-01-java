package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {

        gugudan(4);

        /* 4 x 1 = 4
          4 x 2 = 8
          ...

         4 x 9 = 36
         */

        System.out.println("===================");
        gugudan(4,9); //4단부터 9단까지 구구단 출력

    }

    public static void gugudan(int dan){

        for(int i = 1; i<10; i++){
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        }
   }

   public static void gugudan(int dan1, int dan2){
        for(int i= dan1; i<=dan2; i++){
            gugudan(i);
        }
   }


}
