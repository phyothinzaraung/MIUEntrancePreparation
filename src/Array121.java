public class Array121 {

    static int is121Array(int[ ] a){
        if(a.length < 3) return 0;

        if(a[0] != 1) return 0;

        if(a[a.length-1] !=0) return 0;

        int countBegin1 = 0;
        int countEnd1 = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == 1){
                countBegin1++;
            }else {
                break;
            }
        }
        System.out.println(countBegin1);

        for(int i=countBegin1+1; i<a.length; i++){
            if(a[i] == 1){
                countEnd1++;
            }
        }


        System.out.println(countEnd1);

        if(countBegin1 != countEnd1 || countBegin1 == 0 || countBegin1 == a.length){
            return 0;
        }

        for(int i=countBegin1; i<countEnd1; i++){
            if(a[i] != 2){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
    }
}
