package ch04.sec02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mission02 {
    /*

    (점수를 입력 받음.)
    점수를 입력해주세요> 99


     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력해주세요>");

        int num = scanner.nextInt();

        if(num > 100 || num <0){
            System.out.println("잘못된 점수입니다.");
        }

        else{
            if(num >= 90){
                System.out.println("A");
            } else {
                if(num >= 80){
                    System.out.println("B");

            }else{
                    if(num >= 70){
                        System.out.println("C");
                }else{
                        System.out.println("D");
                    }
                }
        }


    }
}}
