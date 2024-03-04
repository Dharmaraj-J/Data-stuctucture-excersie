package searching;
// Time complexity = O(n)

public class LinearSearchPrac {

    public static void main(String[] args) {

        int[] nums = { 23, 4, 1, 86, 19, 34 };
        int target = 19;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Element found at Index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}