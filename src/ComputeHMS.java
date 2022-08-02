import java.util.ArrayList;
import java.util.Arrays;

public class ComputeHMS {

    static int[] computeHMS(int seconds){
        int[] resultArr = new int[3];

        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = (seconds % 3600) % 60;

        resultArr[0] = hour;
        resultArr[1] = minute;
        resultArr[2] = second;

        System.out.println(Arrays.toString(resultArr));

        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println("HMS: " + computeHMS(0));
    }
}
