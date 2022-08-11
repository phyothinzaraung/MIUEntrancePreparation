import java.util.ArrayList;

public class ClusterCompression {

    static int[] clusterCompression(int[ ] a){
        if(a.length == 0) return new int[1];
        int start = a[0];
        ArrayList<Integer> clusterArr = new ArrayList<>();
        clusterArr.add(start);
        for(int i=1; i<a.length; i++){
            if(a[i] != start){
                clusterArr.add(a[i]);
                start = a[i];
            }
        }

        System.out.println(clusterArr);

        int[] resultArr = new int[clusterArr.size()];
        for(int i=0; i<clusterArr.size(); i++){
            resultArr[i] = clusterArr.get(i);
        }

        return resultArr;
    }

    public static void main(String[] args) {
        clusterCompression(new int[]{3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4});
        clusterCompression(new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0});
        clusterCompression(new int[]{18});
        clusterCompression(new int[]{});
        clusterCompression(new int[]{-5, -5, -5, -5, -5});
        clusterCompression(new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1});
        clusterCompression(new int[]{8, 8, 6, 6, -2, -2, -2});
    }
}
