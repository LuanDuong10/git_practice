package ThuatToan;

public class QuickSort {
    public void swap(int arr[], int number1, int number2) {
        int temp = arr[number1];
        arr[number1] = arr[number2];
        arr[number2] = temp;
    }

    public int partition(int arr[], int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;

        while (true) {
            while (arr[++leftPointer] < pivot) {
                //khong lam gi
            }
            while (arr[rightPointer] > 0 && arr[--rightPointer] > pivot) {
                //khong lam gi
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                System.out.println("Phan tu duoc trao doi: " + arr[leftPointer] + ", " + arr[rightPointer]);
                swap(arr, leftPointer, right);
            }
        }
        System.out.println(" Phan tu chot duoc trao doi: " + arr[leftPointer] + ", " + arr[right]);
        swap(arr, leftPointer, right);
        display(arr);
        return leftPointer;
    }

    public void sapXep(int arr[], int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partition(arr, left, right, pivot);
            sapXep(arr, left, partitionPoint - 1);
            sapXep(arr, partitionPoint + 1, right);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[\n");
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int arr[] = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};

        QuickSort quickSort = new QuickSort();
        System.out.println("Mang du lieu dau vao: ");
        quickSort.display(arr);
        System.out.println("-------------------------");
        quickSort.sapXep(arr, 0, arr.length - 1);
        System.out.println("-------------------------");
        System.out.println("\nMang sau khi da sap xep");
        quickSort.display(arr);
    }
}
