package ch04.sec09;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ArrayShuffleMethod {
    public static void main(String[] args) {
        int[] arr = makeArrayFromTo(5, 8); //[5, 6, 7]
        /*(8,5) [8, 7, 6]*/
        int[] arr2 = makeArrayFromTo(15, 20);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("===============");
        shuffleArray(arr);
        shuffleArray(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] makeArrayFromTo(int num1, int num2) {
        int from = num1;


            int[] arr = new int[num2 - num1];
            for (int i = 0; i < abs(num2 - num1); i++) {
                if(num2 > num1){
                    arr[i] = from++;
                }else{
                    arr[i] = from--;
                }

            }

            return arr;
    }

    public static void shuffleArray(int[] arr){



       for(int i=0; i < arr.length; i++){
           /*0에서 배열의 최대 크기까지의 랜덤값을 구한다.*/
           int random = (int)(Math.random()*arr.length);
           int temp = arr[i];
           arr[i] = arr[random];
           arr[random] = temp;

       }


    }

}
