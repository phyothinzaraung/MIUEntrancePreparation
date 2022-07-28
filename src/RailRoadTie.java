public class RailRoadTie {

    static int isRailroadTie(int[ ] a){
        if(a.length < 3) return 1;
        int startElement = a[0];
        int lastElement = a[a.length-1];
        if(startElement == 0) return 0;
        if(lastElement==0) return 0;

        boolean isRailRoadTie = false;
        for(int i=1; i<a.length; i++){
            if(a[i] == 0){
                if(a[i-1]!=0 && a[i+1]!=0){
                    isRailRoadTie = true;
                }else {
                    isRailRoadTie = false;
                    break;
                }
            }else {
                if((a[i-1]!=0 && a[i+1]==0)|| (a[i-1]==0 && a[i+1]!=0)){
                    isRailRoadTie = true;
                }else {
                    isRailRoadTie = false;
                    break;
                }
            }
        }

        if(isRailRoadTie){
            return 1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isRailroadTie(new int[]{1, 2}));
    }
}
