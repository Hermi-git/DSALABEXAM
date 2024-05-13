package TEST5;
import java.util.Scanner;
public class MergeSort {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        mergeSort(numbers, 0, size - 1);

        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

	}
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid];

        for (int i = 0; i < mid - left + 1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < right -mid; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < mid-left+1 && j < right-mid) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < mid-left+1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < right -mid) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


}
