public class Packed {

    static int isPacked(int[ ] a){
        if(a.length==0) return 1;
        int startElement = a[0];
        int sum = 0;
        boolean isPacked = false;

        for(int i=1; i<a.length; i++){
            if(a[i]==startElement){
                sum += a[i];
            }else {
                startElement = a[i];
            }
        }
        return 0;
    }
}
