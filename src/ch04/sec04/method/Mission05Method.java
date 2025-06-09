package ch04.sec04.method;

public class Mission05Method {
    public static void main(String[] args) {
        int[] arr = {10, 70, 90, 110};
        int sum = addAllUpArray(arr); // 배열의 모든 값을 더한 값을 리턴
        System.out.println(sum);

        int[] arr2= {1,2,10,80,77};

        System.out.println(addAllUpArray(arr2));
    }

    public static int addAllUpArray(int[] arr){
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
