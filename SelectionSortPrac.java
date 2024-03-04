// Time Complexity = O(N^2)

public class SelectionSortPrac {
    public static void main(String[] args) {

        int nums[] = { 34, 3, 24, 2, 4, 90 };
        int size = nums.length;
        int minIndex = 0;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}