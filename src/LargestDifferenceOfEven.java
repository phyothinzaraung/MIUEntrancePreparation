import java.util.ArrayList;

public class LargestDifferenceOfEven {

    static int largestDifferenceOfEvens(int[ ] a){
        if(a.length < 2) return -1;

        ArrayList<Integer> evenArr = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                evenArr.add(a[i]);
            }
        }

        System.out.println(evenArr);

        if(evenArr.size() < 2) return -1;

        int largest = evenArr.get(0), smallest = evenArr.get(0);
        for(int i=1; i<evenArr.size(); i++){
            if(evenArr.get(i) > largest){
                largest = evenArr.get(i);
            }
            if(evenArr.get(i) < smallest){
                smallest = evenArr.get(i);
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + largestDifferenceOfEvens(new int[]{ 2, 2, 2, 2}));
    }
}
