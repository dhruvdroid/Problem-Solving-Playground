package problemSolving;

public class Sorting {

    public static void main(String[] args) {
        switch (3) {
            case 1:
                int a[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0}; // len = 11
                bubbleSort(a);
                break;
            case 2:
                int a1[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0}; // len = 11
                selectionSort(a1);
                break;
            case 3:
                int a2[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0}; // len = 11
                insertionSort(a2);
                break;
        }

    }

    // O(n^2)
    private static void insertionSort(int[] a) {
        int j;
        int key;
        for (int i = 1; i < a.length; i++) {
            j = i - 1;
            key = a[i];
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

            System.out.println();
            System.out.println("Step " + i + "= ");
            for (int item :
                    a) {
                System.out.print(item + ", ");
            }
        }
    }

    // O(n^2)
    private static void selectionSort(int[] a) {
        int minIndex;
        for (int i = 0; i < a.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

            System.out.println();
            System.out.println("Step " + i + "= ");
            for (int item :
                    a) {
                System.out.print(item + ", ");
            }
        }
    }

    // O(n^2)
    private static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (a[j] > a[i]) {
                    // swap number
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println("Step " + i + "= ");
            for (int item :
                    a) {
                System.out.print(item + ", ");
            }
            System.out.println();
        }
    }

}

