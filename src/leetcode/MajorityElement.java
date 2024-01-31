package leetcode;

public class MajorityElement {
    static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        // Traverse the array
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                // If count becomes zero, update the majority element
                majorityElement = nums[i];
                count = 1;
            } else if (nums[i] == majorityElement) {
                // If the current element is the majority element, increment count
                count++;
            } else {
                // If the current element is not the majority element, decrement count
                count--;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,3,2}));
    }
}
