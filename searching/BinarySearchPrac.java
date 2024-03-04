package searching;
// Time Complexity = O(log N)

public class BinarySearchPrac {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 8, 9, 23, 34, 50 };
        int target = 34;

        int result = binSearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at Index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binSearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}