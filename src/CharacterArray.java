import java.util.ArrayList;

public class CharacterArray {

    static char[] charArr(char[] a, int start, int len){

        if(start+len -1 >= a.length || start < 0 || len <= 0){
            return null;
        }

        char[] resultArr = new char[len];

//        for(int i= start, j=0; j<len; i++, j++){
//            resultArr[j] = a[i];
//        }

        int resultIndex = 0;
        while (start < len){
            resultArr[resultIndex++] = a[start];
            start++;
            if(start == len){
                break;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(charArr(new char[]{'a', 'b', 'c'}, -1, 1));
    }

}
