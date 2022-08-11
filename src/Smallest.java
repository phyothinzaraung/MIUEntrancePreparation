public class Smallest {

    static int smallest(int n){
        if(n<0) return 0;
        int tempLength = n;
        int num = 1;
        int[] multiplyArr = new int[tempLength];

        while (n>0) {
            for (int i = 0; i < tempLength; i++) {
                num = n * (i + 1);
                multiplyArr[i] = num;
            }

            if (contains2(multiplyArr)) {
                return multiplyArr[0];
            }

            n++;
        }
        return 0;
    }

    static boolean contains2(int[] arr){
        for(int i=0; i<arr.length; i++){
            String numStr = String.valueOf(arr[i]);
            if(!numStr.contains("2")){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(smallest(4));
    }
}
