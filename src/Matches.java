public class Matches {

    static int matches(int[ ] a, int[ ] p){
        if(a.length==0 || p.length==0 || a.length<p.length) return 0;

        int i,j,count, negative, position = 0, total = 0;

        for(i=0; i<p.length; i++){
            if(p[i] < 0){
                count = -1*p[i];
                negative = 1;
            }else {
                count = p[i];
                negative = 0;
            }

            total += p[i];
            if(total > a.length) return 0;

            for(j=0; j<count; j++){
                if(negative == 1 && a[position++] > 0) return 0;
                if(negative == 0 && a[position++] < 0) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Match status for {1, 2, 3, -5, -5, 2, 3, 18} and {3, -2, 3} is: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println("Match status for {1, 2, 3, -5, -5, 2, 3, 18} and {2, 1, -1, -1, 2, 1} is: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println("Match status for {1, 2, 3, -5, -5, 2, 3, 18} and {1, 2, -1, -1, 1, 2} is: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println("Match status for {1, 2, 3, -5, -5, 2, 3, 18} and {4, -1, 3} is: " + matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println("Match status for {1, 2, 3, -5, -5, 2, 3, 18} and  {2, -3, 3} is: " + matches(new int[] {2, -3, 3}, new int[]{4, -1, 3}));
        System.out.println("Match status for {1, 2, 3, -5, -5, 2, 3, 18} and {8} is: " + matches(new int[]{8}, new int[]{4, -1, 3}));
    }
}
