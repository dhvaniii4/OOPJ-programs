import java.util.Scanner;

public class MenuDrivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, k = 0, size2 = 0;
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr1[] = new int[10];
        System.out.println("Enter array elements: ");
        for (i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("MENU");
        System.out.println("1. Merge Array");
        System.out.println("2. Append/Insert in Array");
        System.out.println("3. Insert Element(with position)");
        System.out.println("4. Delete Element From Array(From last index)");
        System.out.println("5. Delete Element from Array(Given position)");
        System.out.println("Enter operation you would like to perform: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {

                System.out.println("Enter size of second array: ");
                size2 = sc.nextInt();
                int arr2[] = new int[size2 + 1];
                int size3 = size + size2;
                int arr3[] = new int[size3 + 1];
                System.out.println("Enter second array: ");
                for (j = 0; j < size2; j++) {
                    arr2[j] = sc.nextInt();
                }
                for (j = 0; j < size2; j++) {
                    System.out.println(arr2[j]);
                }
                for (k = 0, i = 0; i < size; k++, i++) {
                    arr3[k] = arr1[i];
                }
                for (j = 0; j < size2; k++, j++) {
                    arr3[k] = arr2[j];
                }
                System.out.println();
                System.out.println("Merged array is: ");
                for (k = 0; k < size3; k++) {
                    System.out.print(" " + arr3[k]);
                }
            }
            case 2: {
                System.out.println("Enter element you want to append: ");
                int ins = sc.nextInt();
                for (i = size; i < size + 1; i++) {
                    arr1[i] = ins;
                }
                System.out.println("New Array is: ");
                for (i = 0; i < size + 1; i++) {
                    System.out.print(" " + arr1[i]);
                }
            }
            case 3: {
                System.out.println("Enter element you want to append: ");
                int ins = sc.nextInt();
                System.out.println("At which index would you like to append?: ");
                int pos = sc.nextInt();
                for (i = size; i > pos; i--) {
                    arr1[i] = arr1[i - 1];
                }
                arr1[pos] = ins;
                for (i = 0; i < size + 1; i++) {
                    System.out.println(" " + arr1[i]);
                }
            }
            case 4: {
                System.out.println("New array is");
                for (i = 0; i < size - 1; i++) {
                    System.out.print(arr1[i] + " ");
                }
            }
            case 5: {
                System.out.println("Enter element you would like to delete:");
                int no = sc.nextInt();

                for (i = 0; i < size; i++) {
                    if (arr1[i] == no) {
                        for (j = i; j < size; j++) { // shift element
                            arr1[j] = arr1[j + 1];
                        }
                        break;
                    }
                }
                System.out.println("Final array is:");
                for (i = 0; i < size - 1; i++) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
