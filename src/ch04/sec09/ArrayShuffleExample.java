package ch04.sec09;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));

        /* 0 ~ 9 랜덤값 구한다. 0번 방과 7번방 스와핑
        * 0 ~ 9 랜덤값 구한다. 1번 방과 8번방 스와핑  */



        for (int i = 0; i < arr.length ; i++){
            int random = (int)(Math.random()*10.0);
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}
