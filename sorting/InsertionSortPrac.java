package sorting;
// Time Complexity = O(N^2)

public class InsertionSortPrac {
    public static void main(String[] args) {

        int nums[] = { 22, 4, 1, 5, 32, 17, 6 };
        int size = nums.length;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < size; i++) {

            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}