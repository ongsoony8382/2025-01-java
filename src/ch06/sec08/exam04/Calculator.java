package ch06.sec08.exam04;

public class Calculator {


    public double areaRectangle(double width){
        return width * width;
    }

    //직사각형 넓이 ( 메소드명은 areaRectangle. 오버로딩 )
    public double areaRectangle(double width, double height){
        return width * height;
    }
}
