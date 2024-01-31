package leetcode;

public class Swap {
    static void swap(int x, int y){
        x = x+y;
        y= x-y;
        x=x-y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        swap(5, 10);
    }
}
