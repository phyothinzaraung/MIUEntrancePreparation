public class ZeroPlentiful {

    static int isZeroPlentiful(int[ ] a){

        if(a.length < 4) return 0;

        int zeroCount = 0;
        int plentyCount = 0;

        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
                zeroCount++;
            }else {
                if(zeroCount > 0 && zeroCount < 4) return 0;
                else if(zeroCount >= 4){
                    ++plentyCount;
                    zeroCount = 0;
                }
            }
        }

        if(zeroCount > 0 && zeroCount < 4){
            return 0;
        }

        //plentyCount += zeroCount/4;

        return plentyCount;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isZeroPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));
    }
}
