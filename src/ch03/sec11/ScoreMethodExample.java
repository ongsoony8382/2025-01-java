package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10,100);
        int randomScore2 = getRandomValue(1,5);
        System.out.printf("%d\n",randomScore);


        char grade = getGrade(randomScore);
        //100점 초과시 혹은 0점 미만시 ' ' 리턴
        // 90점 이상 'A'
        // 80점 이상 'B'
        // 70점 이상 'C'
        // 나머지 'D'
        System.out.println(grade);


    }

    public static int getRandomValue(int from, int to){
        int random = (int)(Math.random() * (to-from+1))+ from;
        return random;
    }

    public static char getGrade(int randomScore){
        char score;
        if( randomScore >89 ){

            return 'A';

        } else if (randomScore > 79) {

            return 'B';

        }else if (randomScore > 69){

            return 'C';

        } else if (randomScore < 70) {

            return 'D';

        } else {
            System.out.println("점수가 이상함.");
            return ' ';

        }
    }
}

/*public static char getGrade(int score){
 if(score > 100 || score < 0 ){
 return ' ';
 }
 return switch (score/10){
 case 10, 9 -> 'A';
 case 8 -> 'B';
 case 7 -> 'C' ;
 default -> 'D';
 };
*/