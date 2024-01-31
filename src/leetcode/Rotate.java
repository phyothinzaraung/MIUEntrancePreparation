package leetcode;

public class Rotate {
    static void rotate(int[] nums, int k) {

        int index = 0;

        for(int i=nums.length-k; i<nums.length; i++){
            System.out.println(nums[i]);
        }

        for(int i=0; i<nums.length-k; i++){
            System.out.println(nums[i]);
        }


    }

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
