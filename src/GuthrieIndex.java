import java.util.ArrayList;

public class GuthrieIndex {

    static int guthrieIndex(int n) {

        ArrayList<Integer> guthrieArr = new ArrayList<>();
        int nextValue = 0;

        while (n>1){
            if (n % 2 == 0) {
                nextValue = n / 2;
            } else {
                nextValue = (n * 3) + 1;
            }
            guthrieArr.add(nextValue);
            n = nextValue;
        }

        System.out.println(guthrieArr.toString());

        return guthrieArr.size();
    }

    public static void main(String[] args){
        int result = guthrieIndex(3);
        System.out.println("Result is " + result);

    }
}
