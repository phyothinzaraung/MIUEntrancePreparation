public class EvenOddSubtraction {

    //Write a function that takes an array of integers as an argument and returns a value based on the sums
    // of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and
    // let Y = the sum of the even numbers. The function should return X – Y

    static int subtractOddEven(int[] a){

        int oddSum = 0;
        int evenSum = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){
                evenSum += a[i];
            }else {
                oddSum += a[i];
            }
        }

        return (oddSum - evenSum);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + subtractOddEven(new int[]{4,1,2,3}));
    }
}
