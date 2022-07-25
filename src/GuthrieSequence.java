public class GuthrieSequence {

    static int isGuthrieSequence(int[ ] a){

        if(a[a.length-1] != 1){
            return 0;
        }

        for(int i=0; i< a.length-1; i++){
            if(a[i] % 2 == 0 ){
                if(a[i+1] != a[i]/2) return 0;
            }else {
                if(a[i+1] != (a[i] * 3)+1) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        int[] array = new int[]{8, 17, 4, 1};
        int result = isGuthrieSequence(array);
        System.out.println("Result is: " + result);
    }
}
