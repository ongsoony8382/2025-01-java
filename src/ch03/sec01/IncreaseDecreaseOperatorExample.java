package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z ;

        x++ ;
        ++x;
        System.out.println("x=" + x);
        System.out.println("-----------------");

        y--;
        --y;
        System.out.println("y=" + y);
        System.out.println("-----------------");

        z = x ++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------");

        z = ++x;

        System.out.println("2. z=" + z);
        System.out.println("2. x=" + x);


        System.out.println("-----------------");
        z = ++x + y++;//15 8
        System.out.println("3. z=" + z);  //23
        System.out.println("3. x=" + x); //15
        System.out.println("3. y=" + y); //9



    }
}
