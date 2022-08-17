import java.util.ArrayList;

public class ConcatenatedSum {

    static int checkConcatenatedSum(int n, int catlen){
        int tempNum = n;
        ArrayList<Integer> numArr = new ArrayList<>();
        while (n!=0){
            int remainder = n%10;
            n = n/10;
            numArr.add(remainder);
        }

        int j=0; int sum=0;
        while (j<numArr.size()){
            StringBuilder catLenStr = new StringBuilder();
            for(int i=0; i<catlen; i++){
                catLenStr.append(numArr.get(j));
            }
            j++;

            sum += Integer.parseInt(String.valueOf(catLenStr));
            if(sum== tempNum) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }
}
