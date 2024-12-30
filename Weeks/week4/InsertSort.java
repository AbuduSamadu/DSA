package Weeks.week4;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        InsertSort sort = new InsertSort();
        sort.sort(arr);
        System.out.println(arr);
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}