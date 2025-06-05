package ch06.sec07.exam02;

public class Korean {
    String nation;
    String name;
    String ssn;


    public Korean(String nation, String name, String ssn){
        this.nation=nation;
        this.name=name;
        this.ssn=ssn;
    };

    public Korean(String name, String ssn){
        this.nation = "대한민국";
        this.name = name;
        this.ssn = ssn;
    }

}
