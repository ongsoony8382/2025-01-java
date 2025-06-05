package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    //오버 로딩(Overloading) 똑같은 이름의 메소드를 여러 개 만들 수 있다.

    public Car(){};

    public Car(String model, boolean start, int speed){
        this.model = model;
        this.start = start;
        this.speed = speed;
    }


}
