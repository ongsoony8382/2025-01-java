package ch04.sec04;

public class Mission07 {
    public static void main(String[] args) {
        int[] scores = {90, 88, 100, 70, 60};

        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }

       double avg = ((double)sum / scores.length);
        System.out.println(avg);

    }
}
